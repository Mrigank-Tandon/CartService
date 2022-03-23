package com.example.cart.Services;

import com.example.cart.Entity.OrderHistory;
import com.example.cart.Repository.OrderHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderHistoryImplementation implements OrderHistoryService {

    @Autowired
    OrderHistoryRepo orderHistoryRepo;

    @Override
    public void addOrderHistory(OrderHistory orderHistory) {
        orderHistoryRepo.save(orderHistory);
    }

    @Override
    public List<OrderHistory> getOrderHistory(Integer userId) {
        List<OrderHistory> orderHistoryList = orderHistoryRepo.findAll();
        List<OrderHistory> list = new ArrayList<>();

        for(OrderHistory orderHistory : orderHistoryList){
            if(orderHistory.getUserId() == userId){
                list.add(orderHistory);
            }
        }

        return list;
    }

    @Override
    public OrderHistory getOrderHistoryById(Integer orderId) {

        List<OrderHistory> orderHistory = orderHistoryRepo.findAll();
        for(OrderHistory orderHistory1 : orderHistory){
            if(orderHistory1.getOrderId() == orderId){
                return orderHistory1;
            }
        }
        return null;

    }
}
