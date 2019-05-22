package com.example.includealltask.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderBean {
    @SerializedName("data")
    @Expose
    private List<OrderDataBean> data = null;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    public List<OrderDataBean> getData() {
        return data;
    }

    public void setData(List<OrderDataBean> data) {
        this.data = data;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
