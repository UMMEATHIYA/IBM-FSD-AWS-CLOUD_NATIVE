package com.example.orderservice.controller;

import java.util.List;
import java.util.Optional;

import com.example.orderservice.model.OrderModel;
import com.example.orderservice.service.OrderModelService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class OrderModelController {

    private OrderModelService orderModelService;

    private Environment environment;
    @Autowired
    public OrderModelController(OrderModelService orderModelService, Environment environment) {
        super();
        this.orderModelService = orderModelService;
        this.environment = environment;
    }

    @GetMapping("/")
    public ResponseEntity<String> getStatus()
    {
        return ResponseEntity.ok("Order service is up at port number: "+environment.getProperty("local.server.port"));
    }
    @PostMapping(path = "/orders")
    public ResponseEntity<OrderModel> createOrder(@RequestBody OrderModel orderModel)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderModelService.createOrder(orderModel));
    }

    @GetMapping(path = "/orders")
    public ResponseEntity<List<OrderModel>> displayOrders()
    {
        return ResponseEntity.ok(orderModelService.displayAllOrders());
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<OrderModel> getOrderById(@PathVariable("orderId") Integer orderId) {
        return ResponseEntity.ok(orderModelService.findByOrderId(orderId));
    }

    @GetMapping("/orders/address/{address}")
    public ResponseEntity<OrderModel> findOrderByAddress(@PathVariable("address") String address) {
       OrderModel orderModel = orderModelService.findByAddress(address);
        return ResponseEntity.status(HttpStatus.OK).body(orderModel);
    }

    @DeleteMapping("/orders/{orderId}")
    public HttpStatus deleteOrder(@PathVariable("orderId") Integer orderId) {
        orderModelService.deleteByOrderId(orderId);
        return HttpStatus.OK;
    }
}