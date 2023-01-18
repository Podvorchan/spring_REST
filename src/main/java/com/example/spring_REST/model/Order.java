package com.example.spring_REST.model;


import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Podvorchan Ruslan 15.01.2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  private int id;
  private LocalDate date;
  private double cost;
  private List<Product> products;

}
