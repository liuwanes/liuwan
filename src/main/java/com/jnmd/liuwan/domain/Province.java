package com.jnmd.liuwan.domain;

public class Province {
    private int cityid;
    private String cityname;
    public Province(int cityid, String cityname) {
        super();
        this.cityid = cityid;
        this.cityname = cityname;
    }
    public Province() {
        super();
    }
    public Province(int cityid) {
        super();
        this.cityid = cityid;
    }
    public Province(String cityname) {
        super();
        this.cityname = cityname;
    }
    public int getCityid() {
        return cityid;
    }
    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
    public String getCityname() {
        return cityname;
    }
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    @Override
    public String toString() {
        return "Province [cityid=" + cityid + ", cityname=" + cityname + "]";
    }
    
}
