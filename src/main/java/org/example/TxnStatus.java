package org.example;

public class TxnStatus {

    private boolean confirmed;
    private int block_height;
    private String block_hash;
    private int block_time;

    public TxnStatus(boolean confirmed, int block_height, String block_hash, int block_time) {
        this.confirmed = confirmed;
        this.block_height = block_height;
        this.block_hash = block_hash;
        this.block_time = block_time;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public int getBlock_height() {
        return block_height;
    }

    public void setBlock_height(int block_height) {
        this.block_height = block_height;
    }

    public String getBlock_hash() {
        return block_hash;
    }

    public void setBlock_hash(String block_hash) {
        this.block_hash = block_hash;
    }

    public int getBlock_time() {
        return block_time;
    }

    public void setBlock_time(int block_time) {
        this.block_time = block_time;
    }

}
