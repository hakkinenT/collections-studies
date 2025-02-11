package com.example.utils;

import java.time.Instant;

public class OrderFactory {
    public static Order createOrder(){
        OrderItem it1 = new OrderItem("Café", 25.0, 1);
        OrderItem it2 = new OrderItem("Pão", 2.0, 10);
        OrderItem it3 = new OrderItem("Açucar", 6.0, 3);

        Order order = new Order();
        order.setMoment(Instant.now());
        order.getItems().add(it1);
        order.getItems().add(it2);
        order.getItems().add(it3);
        order.getTotal();
        return order;
    }
}
