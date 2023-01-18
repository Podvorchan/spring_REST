package com.example.spring_REST.repository;

import com.example.spring_REST.model.Order;
import com.example.spring_REST.model.Product;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author Podvorchan Ruslan 15.01.2023
 */
@Data
@Service
public class OrderRepository {

  List<Order> orders;

  public OrderRepository(List<Order> orders) {
    this.orders = orders;
  }

  public Order getById(int id) {
    return orders.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
  }

  public List<Order> getAllOrder() {
    return orders;
  }


  public void addOrder(List<Product> products, int id) {
    double totalCost = 0.0;
    for (Product product : products
    ) {
      totalCost += product.getCost();
    }
    orders.add(new Order(id, LocalDate.now(), totalCost, products));
  }

}
