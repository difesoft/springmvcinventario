package com.difesoft.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.difesoft.spring.modelo.Product;
import com.difesoft.spring.repository.ProductDao;

@Component
public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;

    @Autowired
    private ProductDao productDao;
    
    public void increasePrice(int percentage) {
        List<Product> products = productDao.getProductList();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }
    }

    public List<Product> getProducts() {
        return productDao.getProductList();
    }
    
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
