package org.example;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class BlockInfo {

    private String id;
    private int height;
    private int version;
    private int timestamp;
    private int tx_count;
    private int size;
    private int weight;
    private String merkle_root;
    private String previousblockhash;
    private int mediantime;
    private int nonce;
    private int bits;
    private long difficulty;
    /*
    //@XmlElement(name = "id")
    @JsonProperty("id")
    private String id;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("version")
    private long version;
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("tx_count")
    private long tx_count;
    @JsonProperty("size")
    private long size;
    @JsonProperty("weight")
    private long weight;
    @JsonProperty("merkle_root")
    private String merkle_root;
    @JsonProperty("previousblockhash")
    private String previousblockhash;
    @JsonProperty("mediantime")
    private long mediantime;
    @JsonProperty("nonce")
    private long nonce;
    @JsonProperty("bits")
    private long bits;
    @JsonProperty("difficulty")
    private long difficulty;

     */

    public BlockInfo() {
    }

    public BlockInfo(String id, int height, int version, int timestamp, int tx_count, int size, int weight, String merkle_root,
                     String previousblockhash, int mediantime, int nonce, int bits, long difficulty) {
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
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

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public long getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(long difficulty) {
        this.difficulty = difficulty;
    }

    /*

    public BlockInfo(String id, Integer height, long version, long timestamp, long tx_count, long size, long weight,
                     String merkle_root, String previousblockhash, long mediantime, long nonce, long bits, long difficulty) {
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTx_count() {
        return tx_count;
    }

    public void setTx_count(long tx_count) {
        this.tx_count = tx_count;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
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

    public long getMediantime() {
        return mediantime;
    }

    public void setMediantime(long mediantime) {
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

     */
}
