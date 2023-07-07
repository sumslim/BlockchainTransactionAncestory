package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BlockchainRestClientService {
    private final Logger logger = Logger.getLogger(String.valueOf(BlockchainRestClientService.class));

    private final String BASE_URL = "https://blockstream.info/api/";
    private final String BLOCK_ID_ENDPOINT = "block-height/";
    private final String BLOCK_ENDPOINT = "block/";
    private final String BLOCK_TXN_ENDPOINT = "/txs/";
    private final Client client;

    public BlockchainRestClientService() {
        this.client = Client.create();
    }

    public String getBlockHash(Integer blockId) {

        WebResource webResource = client.resource(BASE_URL + BLOCK_ID_ENDPOINT + blockId);
        ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);
        return output;
    }

    public List<BlockTransaction> getBlockTransaction(String blockHash, int page) {
        WebResource webResource = client.resource(BASE_URL + BLOCK_ENDPOINT + blockHash + BLOCK_TXN_ENDPOINT + page);
        ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        Type listOfBlockTransactionObject = new TypeToken<ArrayList<BlockTransaction>>() {}.getType();
        String jsonString = response.getEntity(String.class);
        List<BlockTransaction> txn = new Gson().fromJson(jsonString, listOfBlockTransactionObject);
        return txn;
    }

    public BlockInfo getBlockInfo(String blockHash) {
        logger.info("Endpoint for getting block info is : " + BASE_URL + BLOCK_ENDPOINT + blockHash);
        WebResource webResource = client.resource(BASE_URL + BLOCK_ENDPOINT + blockHash);
        ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String jsonString = response.getEntity(String.class);
        BlockInfo info = new Gson().fromJson(jsonString, BlockInfo.class);
        return info;
    }
}
