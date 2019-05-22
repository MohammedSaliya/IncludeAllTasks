package com.example.includealltask.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WishlistDataBean {


    @SerializedName("wishlistId")
    @Expose
    private Integer wishlistId;
    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("productUomId")
    @Expose
    private String productUomId;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("productUomValue")
    @Expose
    private String productUomValue;
    @SerializedName("mrp")
    @Expose
    private Integer mrp;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("sellingPrice")
    @Expose
    private Integer sellingPrice;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("productUom")
    @Expose
    private String productUom;
    @SerializedName("productName")
    @Expose
    private String productName;

    public WishlistDataBean(Integer wishlistId, Integer productId, String productUomId, String imageUrl, Integer userId, String description, String productUomValue, Integer mrp, String createdDate, Integer quantity, Integer sellingPrice, Integer categoryId, String productUom, String productName) {
        this.wishlistId = wishlistId;
        this.productId = productId;
        this.productUomId = productUomId;
        this.imageUrl = imageUrl;
        this.userId = userId;
        this.description = description;
        this.productUomValue = productUomValue;
        this.mrp = mrp;
        this.createdDate = createdDate;
        this.quantity = quantity;
        this.sellingPrice = sellingPrice;
        this.categoryId = categoryId;
        this.productUom = productUom;
        this.productName = productName;
    }


    public Integer getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(Integer wishlistId) {
        this.wishlistId = wishlistId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductUomId() {
        return productUomId;
    }

    public void setProductUomId(String productUomId) {
        this.productUomId = productUomId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductUomValue() {
        return productUomValue;
    }

    public void setProductUomValue(String productUomValue) {
        this.productUomValue = productUomValue;
    }

    public Integer getMrp() {
        return mrp;
    }

    public void setMrp(Integer mrp) {
        this.mrp = mrp;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductUom() {
        return productUom;
    }

    public void setProductUom(String productUom) {
        this.productUom = productUom;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
