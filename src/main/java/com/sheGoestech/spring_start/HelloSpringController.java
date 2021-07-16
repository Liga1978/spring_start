package com.sheGoestech.spring_start;

import com.sheGoestech.spring_start.services.ProductService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloSpringController {

    @Autowired
    private ProductService1 productService1;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!!! Spring Container " + productService1.print();
    }
}
