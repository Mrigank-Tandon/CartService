package com.example.cart.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Document(collection = "Cart")
public class Cart implements Serializable {

    @Id
    private String id;



    private Integer productId;
    private Integer merchantId;
    private Integer userId;
    private Integer quantity;
    private String timeStamp;
    private String dateStamp;

    public Cart() {
    }

    public Cart( String id , Integer productId, Integer merchantId, Integer userId, Integer quantity, String timeStamp, String dateStamp) {
        this.id = id;
        this.productId = productId;
        this.merchantId = merchantId;
        this.userId = userId;
        this.quantity = quantity;
        this.timeStamp = timeStamp;
        this.dateStamp = dateStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }



    public String getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(String dateStamp) {
        this.dateStamp = dateStamp;
    }


}
