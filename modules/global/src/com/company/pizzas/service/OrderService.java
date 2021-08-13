package com.company.pizzas.service;

import com.company.pizzas.entity.Order;

import java.math.BigDecimal;

public interface OrderService {
    String NAME = "pizzas_OrderService";

    BigDecimal calculateOrder(Order order);
}