package com.example.includealltask.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderDataBean {

    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("productUom")
    @Expose
    private String productUom;
    @SerializedName("stdDeliveryTime")
    @Expose
    private String stdDeliveryTime;
    @SerializedName("shippingCharge")
    @Expose
    private Integer shippingCharge;
    @SerializedName("cancellation")
    @Expose
    private String cancellation;
    @SerializedName("deliveredDate")
    @Expose
    private String deliveredDate;
    @SerializedName("paymentMode")
    @Expose
    private String paymentMode;
    @SerializedName("pincode")
    @Expose
    private String pincode;
    @SerializedName("productUrl")
    @Expose
    private String productUrl;
    @SerializedName("deliveryStatus")
    @Expose
    private String deliveryStatus;
    @SerializedName("gstAmount")
    @Expose
    private Float gstAmount;
    @SerializedName("sellingPrice")
    @Expose
    private Integer sellingPrice;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("gstPercentage")
    @Expose
    private Integer gstPercentage;
    @SerializedName("deliveredTo")
    @Expose
    private String deliveredTo;
    @SerializedName("delPhone")
    @Expose
    private String delPhone;
    @SerializedName("productUomId")
    @Expose
    private String productUomId;
    @SerializedName("delName")
    @Expose
    private String delName;
    @SerializedName("deliveredBy")
    @Expose
    private String deliveredBy;
    @SerializedName("noOfOrder")
    @Expose
    private Integer noOfOrder;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("totalAmount")
    @Expose
    private Integer totalAmount;
    @SerializedName("netAmount")
    @Expose
    private Float netAmount;
    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("orderDate")
    @Expose
    private String orderDate;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("preferedDeliveryTime")
    @Expose
    private String preferedDeliveryTime;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("cancellationReason")
    @Expose
    private String cancellationReason;
    @SerializedName("transactionStatus")
    @Expose
    private String transactionStatus;
    @SerializedName("specialOffer")
    @Expose
    private String specialOffer;
    @SerializedName("deliveredTime")
    @Expose
    private String deliveredTime;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("failureReason")
    @Expose
    private String failureReason;
    @SerializedName("userId")
    @Expose
    private Integer userId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductUom() {
        return productUom;
    }

    public void setProductUom(String productUom) {
        this.productUom = productUom;
    }

    public String getStdDeliveryTime() {
        return stdDeliveryTime;
    }

    public void setStdDeliveryTime(String stdDeliveryTime) {
        this.stdDeliveryTime = stdDeliveryTime;
    }

    public Integer getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(Integer shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    public Object getDeliveredDate() {
        return deliveredDate;
    }


    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Float getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(Float gstAmount) {
        this.gstAmount = gstAmount;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getGstPercentage() {
        return gstPercentage;
    }

    public void setGstPercentage(Integer gstPercentage) {
        this.gstPercentage = gstPercentage;
    }

    public String getDeliveredTo() {
        return deliveredTo;
    }

    public void setDeliveredTo(String deliveredTo) {
        this.deliveredTo = deliveredTo;
    }

    public String getDelPhone() {
        return delPhone;
    }

    public void setDelPhone(String delPhone) {
        this.delPhone = delPhone;
    }

    public String getProductUomId() {
        return productUomId;
    }

    public void setProductUomId(String productUomId) {
        this.productUomId = productUomId;
    }

    public String getDelName() {
        return delName;
    }

    public void setDelName(String delName) {
        this.delName = delName;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public Integer getNoOfOrder() {
        return noOfOrder;
    }

    public void setNoOfOrder(Integer noOfOrder) {
        this.noOfOrder = noOfOrder;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Float netAmount) {
        this.netAmount = netAmount;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPreferedDeliveryTime() {
        return preferedDeliveryTime;
    }

    public void setPreferedDeliveryTime(String preferedDeliveryTime) {
        this.preferedDeliveryTime = preferedDeliveryTime;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(String specialOffer) {
        this.specialOffer = specialOffer;
    }





    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
