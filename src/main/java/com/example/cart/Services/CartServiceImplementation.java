package com.example.cart.Services;

import com.example.cart.Entity.Cart;
import com.example.cart.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImplementation implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Cart> getProducts(Integer userId) {
        Iterable<Cart> carts = cartRepository.findAll();
        List<Cart> cartList = new ArrayList<>();
        for(Cart i : carts){
            cartList.add(i);
        }
        return cartList;
    }

    @Override
    public Cart updateProducts(Cart cart,String id) {

        Optional<Cart> cart1 = cartRepository.findById(id);
        if(cart1.isPresent()){
            Cart cart2 = cart1.get();
            cart2.setQuantity(cart.getQuantity());
            cart2.setTimeStamp(cart.getTimeStamp());
            cart2.setDateStamp(cart.getDateStamp());
            return cartRepository.save(cart2);
        }else{
            return null;
        }

//            Cart cart1 = cartRepository.findCartContaining(userId , merchantId , productId);
//            cart1.setQuantity(cart.getQuantity());

//        Iterable<Cart> iterable = cartRepository.findAll();
//        Cart cart2= new Cart();
//        for(Cart cart1 : iterable){
//            if(cart1.getProductId() == productId && cart1.getMerchantId() == merchantId
//                        && cart1.getUserId() == userId){
//                cart1.setDateStamp(cart.getDateStamp());
//                cart1.setQuantity(cart.getQuantity());
//                cart1.setTimeStamp(cart.getTimeStamp());
//                cart2 = cart1;
//                cartRepository.save(cart1);
//                break;
//            }
//        }
//        return cart2;
    }

    @Override
    public void deleteProducts(String id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart addProducts(Cart cart) {
       Cart cart1 =  cartRepository.save(cart);
       return cart1;
    }
}
