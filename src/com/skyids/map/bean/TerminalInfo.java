package com.skyids.map.bean;

/**
 * Created by User on 2015/9/16.
 */
public class TerminalInfo {

    private String tID;
    private float lng;
    private float lat;
    private String otherInfo;

    public TerminalInfo() {
    }

    public TerminalInfo(String tID, float lng, float lat, String otherInfo) {
        this.tID = tID;
        this.lng = lng;
        this.lat = lat;
        this.otherInfo = otherInfo;
    }

    public String gettID() {
        return tID;
    }

    public void settID(String tID) {
        this.tID = tID;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
