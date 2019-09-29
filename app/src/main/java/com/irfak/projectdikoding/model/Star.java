package com.irfak.projectdikoding.model;

import com.google.gson.annotations.SerializedName;
import java.util.Comparator;

public class Star {
    @SerializedName("strDate")
    private String strDate;
    @SerializedName("strElemen")
    private String strElemen;
    @SerializedName("strSimbol")
    private String strSimbol;
    @SerializedName("strDescription")
    private String strDescription;


    public Star() {
    }


    public Star(String strDate, String strElemen, String strSimbol, String strDescription) {
        this.strDate = strDate;
        this.strElemen = strElemen;
        this.strSimbol = strSimbol;
        this.strDescription = strDescription;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public String getStrElemen() {
        return strElemen;
    }

    public void setStrElemen(String strElemen) {
        this.strElemen = strElemen;
    }

    public String getStrSimbol() {
        return strSimbol;
    }

    public void setStrSimbol(String strSimbol) {
        this.strSimbol = strSimbol;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

}
