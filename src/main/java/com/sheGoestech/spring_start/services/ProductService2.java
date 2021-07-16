package com.sheGoestech.spring_start.services;

import com.sheGoestech.spring_start.repository.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService2 {

    private final Products products;

    public ProductService2(Products products) {
        this.products = products;
    }
}
