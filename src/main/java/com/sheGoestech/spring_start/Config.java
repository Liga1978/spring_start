package com.sheGoestech.spring_start;

import com.sheGoestech.spring_start.repository.Products;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Config {
  //  @Bean
    public Products createProducts(){
        return new Products();
    }

}
