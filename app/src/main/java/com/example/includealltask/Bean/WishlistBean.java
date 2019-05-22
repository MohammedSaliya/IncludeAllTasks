package com.example.includealltask.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WishlistBean {


    @SerializedName("data")
    @Expose
    private List<WishlistDataBean> data = null;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;


    public WishlistBean(List<WishlistDataBean> data, Integer statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }

    public List<WishlistDataBean> getData() {
        return data;
    }

    public void setData(List<WishlistDataBean> data) {
        this.data = data;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
