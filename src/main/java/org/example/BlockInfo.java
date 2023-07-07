package org.example;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class BlockInfo {

    private String id;
    private int height;
    private int version;
    private long timestamp;
    private int tx_count;
    private int size;
    private int weight;
    private String merkle_root;
    private String previousblockhash;
    private int mediantime;
    private long nonce;
    private long bits;
    private long difficulty;

    public BlockInfo() {
    }

    public BlockInfo(String id, int height, int version, long timestamp, int tx_count, int size, int weight, String merkle_root,
                     String previousblockhash, int mediantime, long nonce, long bits, long difficulty) {
        this.id = id;
        this.height = height;
        this.version = version;
        this.timestamp = timestamp;
        this.tx_count = tx_count;
        this.size = size;
        this.weight = weight;
        this.merkle_root = merkle_root;
        this.previousblockhash = previousblockhash;
        this.mediantime = mediantime;
        this.nonce = nonce;
        this.bits = bits;
        this.difficulty = difficulty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getTx_count() {
        return tx_count;
    }

    public void setTx_count(int tx_count) {
        this.tx_count = tx_count;
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

    public String getMerkle_root() {
        return merkle_root;
    }

    public void setMerkle_root(String merkle_root) {
        this.merkle_root = merkle_root;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public int getMediantime() {
        return mediantime;
    }

    public void setMediantime(int mediantime) {
        this.mediantime = mediantime;
    }

    public long getNonce() {
        return nonce;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public long getBits() {
        return bits;
    }

    public void setBits(long bits) {
        this.bits = bits;
    }

    public long getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(long difficulty) {
        this.difficulty = difficulty;
    }

}
