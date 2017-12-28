package com.jnmd.liuwan.domain;

public class PlaneAirport {
    private int paid;
    private String pacode;
    private String pacity;
    private String paname;
    private String provicnce; 
    
    public PlaneAirport() {
        super();
    }
    public PlaneAirport(String pacode, String pacity, String paname, String provicnce) {
        super();
        this.pacode = pacode;
        this.pacity = pacity;
        this.paname = paname;
        this.provicnce = provicnce;
    }
    public PlaneAirport(int paid, String pacode, String pacity, String paname, String provicnce) {
        super();
        this.paid = paid;
        this.pacode = pacode;
        this.pacity = pacity;
        this.paname = paname;
        this.provicnce = provicnce;
    }
    
    public PlaneAirport(String pacity) {
        super();
        this.pacity = pacity;
    }
    public PlaneAirport(int paid) {
        super();
        this.paid = paid;
    }
    public int getPaid() {
        return paid;
    }
    public void setPaid(int paid) {
        this.paid = paid;
    }
    public String getPacode() {
        return pacode;
    }
    public void setPacode(String pacode) {
        this.pacode = pacode;
    }
    public String getPacity() {
        return pacity;
    }
    public void setPacity(String pacity) {
        this.pacity = pacity;
    }
    public String getPaname() {
        return paname;
    }
    public void setPaname(String paname) {
        this.paname = paname;
    }
    public String getProvicnce() {
        return provicnce;
    }
    public void setProvicnce(String provicnce) {
        this.provicnce = provicnce;
    }
    @Override
    public String toString() {
        return "plane_airport [paid=" + paid + ", pacode=" + pacode + ", pacity=" + pacity + ", paname="
                + paname + ", provicnce=" + provicnce + "]";
    }
    
}
