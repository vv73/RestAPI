
package com.example.restapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TypeChoices {

    @SerializedName("suburban")
    @Expose
    private Suburban suburban;
    @SerializedName("train")
    @Expose
    private Train train;
    @SerializedName("tablo")
    @Expose
    private Tablo tablo;
    @SerializedName("aeroex")
    @Expose
    private Aeroex aeroex;
    @SerializedName("schedule")
    @Expose
    private Schedule__1 schedule;

    public Suburban getSuburban() {
        return suburban;
    }

    public void setSuburban(Suburban suburban) {
        this.suburban = suburban;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Tablo getTablo() {
        return tablo;
    }

    public void setTablo(Tablo tablo) {
        this.tablo = tablo;
    }

    public Aeroex getAeroex() {
        return aeroex;
    }

    public void setAeroex(Aeroex aeroex) {
        this.aeroex = aeroex;
    }

    public Schedule__1 getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule__1 schedule) {
        this.schedule = schedule;
    }

}
