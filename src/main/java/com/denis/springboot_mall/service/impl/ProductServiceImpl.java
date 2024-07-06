package com.denis.springboot_mall.service.impl;

import com.denis.springboot_mall.constant.ProductCategory;
import com.denis.springboot_mall.dao.ProductDao;
import com.denis.springboot_mall.dto.ProductQueryParams;
import com.denis.springboot_mall.dto.ProductRequest;
import com.denis.springboot_mall.model.Product;
import com.denis.springboot_mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProdcutById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
