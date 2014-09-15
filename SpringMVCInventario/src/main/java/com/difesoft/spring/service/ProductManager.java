package com.difesoft.spring.service;

import java.io.Serializable;
import java.util.List;

import com.difesoft.spring.modelo.Product;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}
