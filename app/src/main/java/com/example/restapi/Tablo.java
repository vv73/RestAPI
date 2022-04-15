
package com.example.restapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Tablo {

    @SerializedName("desktop_url")
    @Expose
    private String desktopUrl;
    @SerializedName("touch_url")
    @Expose
    private String touchUrl;

    public String getDesktopUrl() {
        return desktopUrl;
    }

    public void setDesktopUrl(String desktopUrl) {
        this.desktopUrl = desktopUrl;
    }

    public String getTouchUrl() {
        return touchUrl;
    }

    public void setTouchUrl(String touchUrl) {
        this.touchUrl = touchUrl;
    }

}
