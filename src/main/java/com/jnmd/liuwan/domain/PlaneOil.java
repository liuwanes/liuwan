package com.jnmd.liuwan.domain;

public class PlaneOil {
    private int poid;
    private double pocreate;
    private double pooil;
    private int pcid;
    public PlaneOil(int poid, double pocreate, double pooil, int pcid) {
        super();
        this.poid = poid;
        this.pocreate = pocreate;
        this.pooil = pooil;
        this.pcid = pcid;
    }
    public PlaneOil(double pocreate, double pooil, int pcid) {
        super();
        this.pocreate = pocreate;
        this.pooil = pooil;
        this.pcid = pcid;
    }
    public PlaneOil() {
        super();
    }
    public PlaneOil(double pocreate) {
        super();
        this.pocreate = pocreate;
    }
    public int getPoid() {
        return poid;
    }
    public void setPoid(int poid) {
        this.poid = poid;
    }
    public double getPocreate() {
        return pocreate;
    }
    public void setPocreate(double pocreate) {
        this.pocreate = pocreate;
    }
    public double getPooil() {
        return pooil;
    }
    public void setPooil(double pooil) {
        this.pooil = pooil;
    }
    public int getPcid() {
        return pcid;
    }
    public void setPcid(int pcid) {
        this.pcid = pcid;
    }
    @Override
    public String toString() {
        return "PlaneOil [poid=" + poid + ", pocreate=" + pocreate + ", pooil=" + pooil + ", pcid=" + pcid
                + "]";
    }
}
