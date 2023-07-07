package org.example;

public class OutputTxn {

    private String scriptpubkey;
    private String scriptpubkey_asm;
    private String scriptpubkey_type;
    private String scriptpubkey_address;
    private long value;

    public OutputTxn(String scriptpubkey, String scriptpubkey_asm, String scriptpubkey_type, String scriptpubkey_address, long value) {
        this.scriptpubkey = scriptpubkey;
        this.scriptpubkey_asm = scriptpubkey_asm;
        this.scriptpubkey_type = scriptpubkey_type;
        this.scriptpubkey_address = scriptpubkey_address;
        this.value = value;
    }

    public String getScriptpubkey() {
        return scriptpubkey;
    }

    public void setScriptpubkey(String scriptpubkey) {
        this.scriptpubkey = scriptpubkey;
    }

    public String getScriptpubkey_asm() {
        return scriptpubkey_asm;
    }

    public void setScriptpubkey_asm(String scriptpubkey_asm) {
        this.scriptpubkey_asm = scriptpubkey_asm;
    }

    public String getScriptpubkey_type() {
        return scriptpubkey_type;
    }

    public void setScriptpubkey_type(String scriptpubkey_type) {
        this.scriptpubkey_type = scriptpubkey_type;
    }

    public String getScriptpubkey_address() {
        return scriptpubkey_address;
    }

    public void setScriptpubkey_address(String scriptpubkey_address) {
        this.scriptpubkey_address = scriptpubkey_address;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
