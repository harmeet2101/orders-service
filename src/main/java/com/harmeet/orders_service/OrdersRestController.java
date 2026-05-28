package com.harmeet.orders_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersRestController {

  @GetMapping("/health")
  public String healthCheck() {
    return "Order service works!";
  }
}
