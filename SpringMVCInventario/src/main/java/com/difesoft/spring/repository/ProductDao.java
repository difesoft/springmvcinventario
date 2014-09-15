package com.difesoft.spring.repository;

import java.util.List;

import com.difesoft.spring.modelo.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);
}
