package com.sheGoestech.spring_start.services;

import com.sheGoestech.spring_start.repository.Products;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService3 {
    private Products products;
    @Autowired
  public void setProducts(Products products){
      this.products = products;
  }


}
