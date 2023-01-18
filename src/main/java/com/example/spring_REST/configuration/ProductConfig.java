package com.example.spring_REST.configuration;

import com.example.spring_REST.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Podvorchan Ruslan 15.01.2023
 */
@Configuration
public class ProductConfig {

  @Bean
  public Product cocaCola() {
    return new Product(1, "Coca-Cola", 38.50);
  }

  @Bean
  public Product pepsi() {
    return new Product(2, "Pepsi", 40);
  }

  @Bean
  public Product borgomi() {
    return new Product(3, "Borgomi", 69.3);
  }

  @Bean
  public Product redBull() {
    return new Product(4, "RedBull", 59);
  }

}
