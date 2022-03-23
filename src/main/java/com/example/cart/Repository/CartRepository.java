package com.example.cart.Repository;

import com.example.cart.Entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

//    Cart findCartContaining(Integer userId , Integer merchantId ,Integer productId);
}
