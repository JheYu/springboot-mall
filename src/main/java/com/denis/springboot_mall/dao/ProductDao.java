package com.denis.springboot_mall.dao;

import com.denis.springboot_mall.dto.ProductRequest;
import com.denis.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
