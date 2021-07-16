package com.sheGoestech.spring_start.services;

import com.sheGoestech.spring_start.repository.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService1 {
    @Autowired
    private Products products;

    public String print(){
        return "name -> Product Service 1\n"+
                "dependencies->{"+products.print()+" " +
                "}\n";

    }


}
