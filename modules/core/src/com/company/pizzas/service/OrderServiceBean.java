package com.company.pizzas.service;

import com.company.pizzas.entity.Order;
import com.company.pizzas.entity.OrderItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(OrderService.NAME)
public class OrderServiceBean implements OrderService {
    public BigDecimal calculateOrder(Order order) {
        BigDecimal amount = BigDecimal.ZERO;

        int pizzaCount = 0;
        if (order.getItems() != null) {
            for(OrderItem item : order.getItems()) {
                pizzaCount += item.getQuantity();
                amount = amount.add(BigDecimal.valueOf(item.getQuantity()).multiply(item.getPizza().getPrice()));
            }
        }
        if (pizzaCount > 3) {
            amount = amount.multiply(BigDecimal.valueOf(0.95));
        } else if (pizzaCount > 8) {
            amount = amount.multiply(BigDecimal.valueOf(0.9));
        }
        if (amount.doubleValue() < 1500.00) {
            amount = amount.add(BigDecimal.valueOf(100));
        }
        return amount;
    }
}