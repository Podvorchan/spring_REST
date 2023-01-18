package com.example.spring_REST.configuration;


import com.example.spring_REST.model.Order;
import java.time.LocalDate;
import java.time.Month;

import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author Podvorchan Ruslan 15.01.2023
 */
@Configuration
@Service
@Data
public class OrderConfig {

  private final ProductConfig productConfig;


  @Autowired
  public OrderConfig(ProductConfig productConfig) {

    this.productConfig = productConfig;
  }

  @Bean
  public Order specificOrder() {
    return new Order(1, LocalDate.of(2023, Month.JANUARY, 2), 38.50,
        List.of(productConfig.cocaCola()));
  }

  @Bean
  public Order fullOrder() {
    return new Order(2, LocalDate.of(2023, Month.JANUARY, 3), 206.8,
        List.of(productConfig.cocaCola(), productConfig.pepsi(), productConfig.borgomi(),
            productConfig.redBull()));
  }

}
