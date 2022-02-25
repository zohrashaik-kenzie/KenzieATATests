package com.kenzie.examples.modifiers;

public class Access {
    private String pvt;
    public String pub;
    protected String prot;

    public Access(String pvt, String pub, String prot) {
        this.pvt = pvt;
        this.pub = pub;
        this.prot = prot;
    }

    public String getPvt() {
        return pvt;
    }
}
