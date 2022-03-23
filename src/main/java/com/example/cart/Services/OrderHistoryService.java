package com.example.cart.Services;

import com.example.cart.Entity.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    void addOrderHistory(OrderHistory orderHistory);
    List<OrderHistory> getOrderHistory(Integer userId);
    OrderHistory getOrderHistoryById(Integer orderId);
}
