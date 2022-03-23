package com.example.cart.Repository;

import com.example.cart.Entity.OrderHistory;
import org.hibernate.criterion.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface OrderHistoryRepo extends MongoRepository<OrderHistory , String> {



}
