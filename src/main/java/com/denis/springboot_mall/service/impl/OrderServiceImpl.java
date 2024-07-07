package com.denis.springboot_mall.service.impl;

import com.denis.springboot_mall.dao.OrderDao;
import com.denis.springboot_mall.dao.ProductDao;
import com.denis.springboot_mall.dto.BuyItem;
import com.denis.springboot_mall.dto.CreateOrderRequest;
import com.denis.springboot_mall.dto.UserLoginRequest;
import com.denis.springboot_mall.model.Order;
import com.denis.springboot_mall.model.OrderItem;
import com.denis.springboot_mall.model.Product;
import com.denis.springboot_mall.service.OrderServie;
import com.denis.springboot_mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderServie {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();
        for(BuyItem buyItem : createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());

            //計算總價錢
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount = totalAmount +amount;

            //轉換 BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        //創建訂單
        Integer orderId = orderDao.createOrder(userId,totalAmount);

        orderDao.createOderItems(orderId,orderItemList);

        return orderId;
    }

    @Override
    public Order getOrderById(Integer orderId) {

        Order order =  orderDao.getOrderById(orderId);

        List<OrderItem> orderItemList = orderDao.getOderItemsByOrderId(orderId);

        order.setOrderItemList(orderItemList);

        return order;
    }
}
