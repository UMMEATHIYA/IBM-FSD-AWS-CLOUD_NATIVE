package com.example.orderservice.service;

import com.example.orderservice.model.OrderModel;

import java.util.List;
import java.util.Optional;

public interface OrderModelService {
    public OrderModel createOrder(OrderModel orderModel);

    public List<OrderModel> displayAllOrders();

    public OrderModel findByOrderId(Integer orderId);

    public OrderModel findByAddress(String address);

    public Integer deleteByOrderId(Integer orderId);

    //public OrderModel updateOrder(OrderModel orderModel);

    public List<OrderModel> findByName(String name);

}
