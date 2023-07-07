package org.example;

import java.util.ArrayList;
import java.util.List;

public class InputTxn {

    private String txid;
    private long vout;
    private OutputTxn prevout;
    private String scriptsig;
    private String scriptsig_asm;
    private ArrayList<String> witness;
    private boolean is_coinbase;
    private Object sequence;
    private String inner_redeemscript_asm;
    private String inner_witnessscript_asm;

    public InputTxn(String txid, long vout, OutputTxn prevout, String scriptsig, String scriptsig_asm, ArrayList<String> witness,
                    boolean is_coinbase, Object sequence, String inner_redeemscript_asm, String inner_witnessscript_asm) {
        this.txid = txid;
        this.vout = vout;
        this.prevout = prevout;
        this.scriptsig = scriptsig;
        this.scriptsig_asm = scriptsig_asm;
        this.witness = witness;
        this.is_coinbase = is_coinbase;
        this.sequence = sequence;
        this.inner_redeemscript_asm = inner_redeemscript_asm;
        this.inner_witnessscript_asm = inner_witnessscript_asm;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public long getVout() {
        return vout;
    }

    public void setVout(long vout) {
        this.vout = vout;
    }

    public OutputTxn getPrevout() {
        return prevout;
    }

    public void setPrevout(OutputTxn prevout) {
        this.prevout = prevout;
    }

    public String getScriptsig() {
        return scriptsig;
    }

    public void setScriptsig(String scriptsig) {
        this.scriptsig = scriptsig;
    }

    public String getScriptsig_asm() {
        return scriptsig_asm;
    }

    public void setScriptsig_asm(String scriptsig_asm) {
        this.scriptsig_asm = scriptsig_asm;
    }

    public ArrayList<String> getWitness() {
        return witness;
    }

    public void setWitness(ArrayList<String> witness) {
        this.witness = witness;
    }

    public boolean isIs_coinbase() {
        return is_coinbase;
    }

    public void setIs_coinbase(boolean is_coinbase) {
        this.is_coinbase = is_coinbase;
    }

    public Object getSequence() {
        return sequence;
    }

    public void setSequence(Object sequence) {
        this.sequence = sequence;
    }

    public String getInner_redeemscript_asm() {
        return inner_redeemscript_asm;
    }

    public void setInner_redeemscript_asm(String inner_redeemscript_asm) {
        this.inner_redeemscript_asm = inner_redeemscript_asm;
    }

    public String getInner_witnessscript_asm() {
        return inner_witnessscript_asm;
    }

    public void setInner_witnessscript_asm(String inner_witnessscript_asm) {
        this.inner_witnessscript_asm = inner_witnessscript_asm;
    }

}
