package com.denis.springboot_mall.dao;

import com.denis.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
