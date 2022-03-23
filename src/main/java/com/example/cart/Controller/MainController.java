package com.example.cart.Controller;


import com.example.cart.Entity.Cart;
import com.example.cart.Entity.OrderHistory;
import com.example.cart.Services.CartService;
import com.example.cart.Services.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class MainController {

    @Autowired
    CartService cartService;

    @Autowired
    OrderHistoryService orderHistoryService;

    @GetMapping("/getcartproduct")
    public List<Cart> getProducts(Integer userId){
        return cartService.getProducts(userId);
    }

    @PostMapping("/addtocart")
    public void addCart(@RequestBody @Valid Cart cart){

         cartService.addProducts(cart);

    }

    @PutMapping("/updatecart")
    public Cart updateCart(@RequestBody @Valid Cart cart , @RequestParam String id){



        return cartService.updateProducts(cart , id);
    }

    @DeleteMapping("/deletecart")
    public void deleteCart(@RequestParam @Valid String id){
        cartService.deleteProducts(id);
    }


    @PostMapping("/addToOrderHistory")
    public void addToOrderHistory(@RequestBody OrderHistory order ){
        orderHistoryService.addOrderHistory(order);
    }

    @GetMapping("/getOrderhistory")
    public List<OrderHistory> getOrderhistory(Integer userId){
        return orderHistoryService.getOrderHistory(userId);
    }

    @GetMapping("/getOrderhistoryById")
    public OrderHistory getOrderhistoryByid(Integer orderId){
        return orderHistoryService.getOrderHistoryById(orderId);
    }









}
