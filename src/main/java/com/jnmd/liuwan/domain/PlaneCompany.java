package com.jnmd.liuwan.domain;

public class PlaneCompany {
    private int pcid;
    private String pcname;
    public PlaneCompany(int pcid, String pcname) {
        super();
        this.pcid = pcid;
        this.pcname = pcname;
    }
    public PlaneCompany(int pcid) {
        super();
        this.pcid = pcid;
    }
    
    public PlaneCompany(String pcname) {
        super();
        this.pcname = pcname;
    }
    public PlaneCompany() {
        super();
    }
    public int getPcid() {
        return pcid;
    }
    public void setPcid(int pcid) {
        this.pcid = pcid;
    }
    public String getPcname() {
        return pcname;
    }
    public void setPcname(String pcname) {
        this.pcname = pcname;
    }
    @Override
    public String toString() {
        return "PlaneCompany [pcid=" + pcid + ", pcname=" + pcname + "]";
    }
}
