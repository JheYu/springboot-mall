package com.denis.springboot_mall.dao;

import com.denis.springboot_mall.dto.ProductRequest;
import com.denis.springboot_mall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
