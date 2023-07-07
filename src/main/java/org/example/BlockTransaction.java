package org.example;

import java.util.ArrayList;
import java.util.List;

public class BlockTransaction {

    private String txid;
    private int version;
    private long locktime;
    private ArrayList<InputTxn> vin;
    private ArrayList<OutputTxn> vout;
    private int size;
    private int weight;
    private int fee;
    private TxnStatus status;

    public BlockTransaction(String txid, int version, long locktime, ArrayList<InputTxn> vin, ArrayList<OutputTxn> vout,
                            int size, int weight, int fee, TxnStatus status) {
        this.txid = txid;
        this.version = version;
        this.locktime = locktime;
        this.vin = vin;
        this.vout = vout;
        this.size = size;
        this.weight = weight;
        this.fee = fee;
        this.status = status;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getLocktime() {
        return locktime;
    }

    public void setLocktime(long locktime) {
        this.locktime = locktime;
    }

    public ArrayList<InputTxn> getVin() {
        return vin;
    }

    public void setVin(ArrayList<InputTxn> vin) {
        this.vin = vin;
    }

    public ArrayList<OutputTxn> getVout() {
        return vout;
    }

    public void setVout(ArrayList<OutputTxn> vout) {
        this.vout = vout;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public TxnStatus getStatus() {
        return status;
    }

    public void setStatus(TxnStatus status) {
        this.status = status;
    }
}
