package com.denis.springboot_mall.service;

import com.denis.springboot_mall.dto.CreateOrderRequest;
import com.denis.springboot_mall.dto.OrderQueryParams;
import com.denis.springboot_mall.model.Order;

import java.util.List;

public interface OrderServie {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
