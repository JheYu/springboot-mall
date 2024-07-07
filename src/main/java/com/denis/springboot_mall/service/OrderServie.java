package com.denis.springboot_mall.service;

import com.denis.springboot_mall.dto.CreateOrderRequest;

public interface OrderServie {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
