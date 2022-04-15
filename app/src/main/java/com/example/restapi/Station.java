
package com.example.restapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Station {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("station_type")
    @Expose
    private String stationType;
    @SerializedName("type_choices")
    @Expose
    private TypeChoices typeChoices;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("popular_title")
    @Expose
    private Object popularTitle;
    @SerializedName("short_title")
    @Expose
    private Object shortTitle;
    @SerializedName("majority")
    @Expose
    private Integer majority;
    @SerializedName("transport_type")
    @Expose
    private String transportType;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("station_type_name")
    @Expose
    private String stationTypeName;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public TypeChoices getTypeChoices() {
        return typeChoices;
    }

    public void setTypeChoices(TypeChoices typeChoices) {
        this.typeChoices = typeChoices;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getPopularTitle() {
        return popularTitle;
    }

    public void setPopularTitle(Object popularTitle) {
        this.popularTitle = popularTitle;
    }

    public Object getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(Object shortTitle) {
        this.shortTitle = shortTitle;
    }

    public Integer getMajority() {
        return majority;
    }

    public void setMajority(Integer majority) {
        this.majority = majority;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStationTypeName() {
        return stationTypeName;
    }

    public void setStationTypeName(String stationTypeName) {
        this.stationTypeName = stationTypeName;
    }

}
