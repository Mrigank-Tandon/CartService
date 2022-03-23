package com.example.cart.Services;

import com.example.cart.Entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getProducts(Integer userId);
    Cart updateProducts(Cart cart ,String id);
    void deleteProducts(String cart);
    Cart addProducts(Cart cart);
}
