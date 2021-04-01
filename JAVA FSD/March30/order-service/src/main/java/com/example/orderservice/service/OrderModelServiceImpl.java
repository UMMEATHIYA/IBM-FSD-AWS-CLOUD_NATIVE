package com.example.orderservice.service;

import com.example.orderservice.model.OrderModel;
import com.example.orderservice.repo.OrderModelRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderModelServiceImpl implements OrderModelService {

    private OrderModelRepository orderModelRepository;

    @Autowired
    public OrderModelServiceImpl(OrderModelRepository orderModelRepository){
        this.orderModelRepository = orderModelRepository;
    }


    @Override
    public OrderModel createOrder(OrderModel orderModel) {
        return orderModelRepository.save(orderModel);
    }

    @Override
    public List<OrderModel> displayAllOrders() {
        return orderModelRepository.findAll();
    }

    @Override
    public OrderModel findByOrderId(Integer orderId) {
        return orderModelRepository.findByOrderId(orderId);
    }


    @Override
    public OrderModel findByAddress(String address) {
        return orderModelRepository.findByAddress(address);
    }

    @Override
    public Integer deleteByOrderId(Integer orderId) {

        return orderModelRepository.deleteByOrderId(orderId);
    }




    @Override
    public List<OrderModel> findByName(String name) {
        List<OrderModel> orderModels=orderModelRepository.findByName(name);
        return orderModels;
    }


}
