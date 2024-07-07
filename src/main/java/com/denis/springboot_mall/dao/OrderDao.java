package com.denis.springboot_mall.dao;

import com.denis.springboot_mall.dto.OrderQueryParams;
import com.denis.springboot_mall.model.Order;
import com.denis.springboot_mall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, int totalAmount);

    void createOderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOderItemsByOrderId(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
