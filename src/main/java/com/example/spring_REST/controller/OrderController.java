package com.example.spring_REST.controller;

import com.example.spring_REST.repository.OrderRepository;
import com.example.spring_REST.model.Order;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Podvorchan Ruslan 15.01.2023
 */
@RestController
@RequiredArgsConstructor
public class OrderController {

  private final OrderRepository orderRepository;

  @GetMapping(value = "/orders/{id}")
  public Order getById(@PathVariable int id) {
    return orderRepository.getById(id);
  }

  @GetMapping(value = "/orders")
  public List<Order> getAllOrders() {
    return orderRepository.getAllOrder();
  }

}
