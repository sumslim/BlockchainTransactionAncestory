package org.example;

public class BlockAncestory {

    private String txnId;
    private long ancestoryCount;

    public BlockAncestory(String txnId, long ancestoryCount) {
        this.txnId = txnId;
        this.ancestoryCount = ancestoryCount;
    }

    public String getTxnId() {
        return txnId;
    }

    public long getAncestoryCount() {
        return ancestoryCount;
    }
}
