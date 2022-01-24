package com.example.webgis.Damain;

/**
 * 地标
 *
 * @author lidx
 * @date 2022/01/24
 */
public class Site {
    private int id;
    private String code;
    private String name;
    private double lng;
    private double lat;
    private String adname;
    private int adcode;
    private String address;
    private String type;
    public int getId(){return id;}
    public String getCode(){return code;}
    public String getName(){return name;}
    public double getLng(){return lng;}
    public double getLat(){return lat;}
    public String getAdname(){return adname;}
    public int getAdcode(){return adcode;}

    public void setId(){this.id=id;}
    public void setCode(){this.code=code;}
    public void setName(){this.name=name;}
    public void setLng(){this.lng=lng;}
    public void setLat(){this.lat=lat;}
    public void setAdname(){this.adname=adname;}
    public void setAdcode(){this.adcode=adcode;}
}
