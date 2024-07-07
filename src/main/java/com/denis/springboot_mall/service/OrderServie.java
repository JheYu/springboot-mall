package com.denis.springboot_mall.service;

import com.denis.springboot_mall.dto.CreateOrderRequest;
import com.denis.springboot_mall.model.Order;

public interface OrderServie {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
