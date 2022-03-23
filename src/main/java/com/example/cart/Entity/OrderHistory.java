package com.example.cart.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Document(collection = "OrderHistory")
public class OrderHistory implements Serializable {

    @Id
    private String id;


    private Integer orderId;
    private Integer userId;
    private Integer merchantId;

    private List<Cart> cartList;

    public OrderHistory() {
    }

    public OrderHistory(String id, Integer orderId, Integer userId, Integer merchantId, List<Cart> cartList) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.merchantId = merchantId;
        this.cartList = cartList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
}
