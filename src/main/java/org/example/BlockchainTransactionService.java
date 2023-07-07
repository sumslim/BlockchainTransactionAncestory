package org.example;

import javafx.util.Pair;

import java.util.*;
import java.util.logging.Logger;

public class BlockchainTransactionService {

    private final Logger logger = Logger.getLogger(String.valueOf(BlockchainTransactionService.class));

    private final BlockchainRestClientService blockchainRestClientService;

    public BlockchainTransactionService() {
        this.blockchainRestClientService = new BlockchainRestClientService();
    }


    public List<BlockAncestory> getTopAncestory(Integer blockId, int topCount) {
        final String blockHash = blockchainRestClientService.getBlockHash(blockId);
        if(blockHash == null) {
            logger.severe("BlockId doesn't exist");
            throw new IllegalArgumentException("BlockId is not valid");
        }
        final BlockInfo info = blockchainRestClientService.getBlockInfo(blockHash);
        if(info == null) {
            logger.severe("No information exist for blockId : {}" + blockId);
            throw new IllegalArgumentException("No information exist for blockId :"  + blockId);
        }
        List<BlockTransaction> blockTransactionList = new ArrayList<>();
        long totalTxn = info.getTx_count();
        logger.info("Total number of transactions : " + totalTxn);
        int cnt = 0;
        while(cnt<totalTxn) {
            final List<BlockTransaction> txnList = blockchainRestClientService.getBlockTransaction(blockHash, cnt);
            blockTransactionList.addAll(txnList);
            cnt += 25;
        }
        Map<String, List<String>> ancestoryMap = getAncestoryMap(blockTransactionList);
        List<BlockAncestory> blockAncestoryList = new ArrayList<>();
        // dfs to track all the ancestors
        Map<String, Integer> ancestoryCount = getAllAncestors(ancestoryMap);
        PriorityQueue<Pair<String, Integer> > pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        int k = 0;
        for(Map.Entry<String, Integer> ancestorCount : ancestoryCount.entrySet()) {
            if(k>=topCount){
                break;
            }
            pq.add(new Pair<>(ancestorCount.getKey(), ancestorCount.getValue()));
            k++;
        }
        while(!pq.isEmpty()) {
            Pair<String, Integer> p = pq.poll();
            blockAncestoryList.add(new BlockAncestory(p.getKey(), p.getValue()));
        }
        return blockAncestoryList;
    }

    private Map<String, Integer> getAllAncestors(Map<String, List<String>> ancestoryMap) {
        Map<String, Integer> ancestoryCount = new HashMap<>();
        for(Map.Entry<String, List<String>> entry : ancestoryMap.entrySet()) {
            int ancestorCnt = getAncestors(entry.getKey(), ancestoryMap, ancestoryCount);
            ancestoryCount.put(entry.getKey(), ancestorCnt);
        }
        return ancestoryCount;
    }

    private int getAncestors(String currentTxnId, Map<String, List<String>> ancestoryMap,
                             Map<String, Integer> ancestoryCount) {
        if(ancestoryCount.containsKey(currentTxnId)) {
            return ancestoryCount.get(currentTxnId);
        }
        int ancestorCnt = 0;
        for(String parentId : ancestoryMap.get(currentTxnId)) {
            ancestorCnt++;
            getAncestors(parentId, ancestoryMap, ancestoryCount);
        }
        return ancestorCnt;
    }
    private Map<String, List<String>> getAncestoryMap(List<BlockTransaction> blockTransactionList) {
        logger.info("Total count of transactions received : " + blockTransactionList.size());
        Map<String, List<String>> ancestoryMap = new HashMap<>();
        final Set<String> firstLevelIds = new HashSet<>();
        for(BlockTransaction blockTransaction : blockTransactionList) {
            firstLevelIds.add(blockTransaction.getTxid());
        }
        for(BlockTransaction blockTransaction : blockTransactionList) {
            final List<String> parentIds = new ArrayList<>();
            for(InputTxn inputTxn : blockTransaction.getVin()) {
                if(firstLevelIds.contains(inputTxn.getTxid())) {
                    parentIds.add(inputTxn.getTxid());
                }
            }
            if(ancestoryMap.containsKey(blockTransaction.getTxid())) {
                ancestoryMap.get(blockTransaction.getTxid()).addAll(parentIds);
            }
            else{
                ancestoryMap.put(blockTransaction.getTxid(), parentIds);
            }
        }
        return ancestoryMap;
    }
}
