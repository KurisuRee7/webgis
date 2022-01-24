package com.example.webgis.Damain.SurroundSite;

public class SurroundSite {
    private String FID;
    private String name;
    private String pyname;
    private String telephone;
    private double lng;
    private double lat;
    private String address;
    public void setName(String name) {this.name = name;}
    public void setPyname(String pyname) {this.pyname = pyname;}
    public void setTelephone(String telephone) {this.telephone = telephone;}
    public void setLng(double lng) {this.lng = lng;}
    public void setLat(double lat) {this.lat = lat;}
    public void setAddress(String address) {this.address = address;}
    public String getFID() {return FID;}
    public String getName() {return name;}
    public String getPyname() {return pyname;}
    public String getTelephone() {return telephone;}
    public double getLng() {return lng;}
    public double getLat() {return lat;}
    public String getAddress() {return address;}
    public void setFID(String FID) {this.FID = FID;}
}
