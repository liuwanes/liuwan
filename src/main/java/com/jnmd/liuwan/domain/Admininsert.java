package com.jnmd.liuwan.domain;


public class Admininsert {
    private int pmid;
    private String pmfight;
    private int pmstartcity;
    private int pmendcity;
    private String pmstarttime;
    private String pmendtime;
    private double pmprice;
    private int pcid;
    private int poid;
    
    private String pacity;
    private String cityname;
    private String pcname;
    private String pooil;
    
    public Admininsert() {
        super();
    }
    public Admininsert(String pmfight, int pmstartcity, int pmendcity,
            String pmstarttime, String pmendtime, double pmprice, int pcid, int poid) {
        super();
        this.pmfight = pmfight;
        this.pmstartcity = pmstartcity;
        this.pmendcity = pmendcity;
        this.pmstarttime = pmstarttime;
        this.pmendtime = pmendtime;
        this.pmprice = pmprice;
        this.pcid = pcid;
        this.poid = poid;
    }
    public Admininsert(int pmid, String pmfight, int pmstartcity, int pmendcity,
            String pmstarttime, String pmendtime, double pmprice, int pcid, int poid) {
        super();
        this.pmid = pmid;
        this.pmfight = pmfight;
        this.pmstartcity = pmstartcity;
        this.pmendcity = pmendcity;
        this.pmstarttime = pmstarttime;
        this.pmendtime = pmendtime;
        this.pmprice = pmprice;
        this.pcid = pcid;
        this.poid = poid;
    }
    public Admininsert(int pmid) {
        super();
        this.pmid = pmid;
    }
    public int getPmid() {
        return pmid;
    }
    public void setPmid(int pmid) {
        this.pmid = pmid;
    }
    public String getPmfight() {
        return pmfight;
    }
    public void setPmfight(String pmfight) {
        this.pmfight = pmfight;
    }
    public int getPmstartcity() {
        return pmstartcity;
    }
    public void setPmstartcity(int pmstartcity) {
        this.pmstartcity = pmstartcity;
    }
    public int getPmendcity() {
        return pmendcity;
    }
    public void setPmendcity(int pmendcity) {
        this.pmendcity = pmendcity;
    }
    public String getPmstarttime() {
        return pmstarttime;
    }
    public void setPmstarttime(String pmstarttime) {
        this.pmstarttime = pmstarttime;
    }
    public String getPmendtime() {
        return pmendtime;
    }
    public void setPmendtime(String pmendtime) {
        this.pmendtime = pmendtime;
    }
    public double getPmprice() {
        return pmprice;
    }
    public void setPmprice(double pmprice) {
        this.pmprice = pmprice;
    }
    public int getPcid() {
        return pcid;
    }
    public void setPcid(int pcid) {
        this.pcid = pcid;
    }
    public int getPoid() {
        return poid;
    }
    public void setPoid(int poid) {
        this.poid = poid;
    }
    

    public String getPacity() {
        return pacity;
    }
    public void setPacity(String pacity) {
        this.pacity = pacity;
    }
    public String getCityname() {
        return cityname;
    }
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    public String getPcname() {
        return pcname;
    }
    public void setPcname(String pcname) {
        this.pcname = pcname;
    }
    public String getPooil() {
        return pooil;
    }
    public void setPooil(String pooil) {
        this.pooil = pooil;
    }
    @Override
    public String toString() {
        return "Admininsert [pmid=" + pmid + ", pmfight=" + pmfight + ", pmstartcity=" + pmstartcity
                + ", pmendcity=" + pmendcity + ", pmstarttime=" + pmstarttime + ", pmendtime=" + pmendtime
                + ", pmprice=" + pmprice + ", pcid=" + pcid + ", poid=" + poid + ", pacity=" + pacity
                + ", cityname=" + cityname + ", pcname=" + pcname + ", pooil=" + pooil + "]";
    }
    
    
    
}
