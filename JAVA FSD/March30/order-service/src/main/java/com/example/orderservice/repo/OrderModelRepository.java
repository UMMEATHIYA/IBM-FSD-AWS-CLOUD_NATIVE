package com.example.orderservice.repo;

import com.example.orderservice.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderModelRepository extends JpaRepository<OrderModel, Integer>{
    @Query
    public OrderModel findByOrderId(Integer orderId);
    @Query
    public OrderModel findByAddress(String address);
    @Query
    public Integer deleteByOrderId(Integer orderId);

    @Query
    public List<OrderModel> findByName(String name);
}