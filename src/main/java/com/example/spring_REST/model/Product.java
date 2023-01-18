package com.example.spring_REST.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Podvorchan Ruslan 15.01.2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private int id;
  private String name;
  private double cost;

}
