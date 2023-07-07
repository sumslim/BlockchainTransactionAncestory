package org.example;

import java.util.List;
import java.util.logging.Logger;

public class BlockchainTransactionAncestorEndpoint {
    private static final Logger logger = Logger.getLogger(String.valueOf(BlockchainTransactionAncestorEndpoint.class));


    public static void main(String[] args) {
        BlockchainTransactionService service = new BlockchainTransactionService();
        int blockId = 680000;
        int count = 10;
        final List<BlockAncestory> blockAncestoryList = service.getTopAncestory(blockId, count);
        for(BlockAncestory blockAncestory : blockAncestoryList) {
            logger.info("TransactionId : " + blockAncestory.getTxnId() + " Count " + blockAncestory.getAncestoryCount());
        }
    }

}
