package com.example.streams;

import java.util.*;

import com.example.utils.Order;
import com.example.utils.OrderFactory;
import com.example.utils.OrderItem;

public class StreamFlatMapTest {
    public static void main(String[] args) {
        Order o1 = OrderFactory.createOrder();
        Order o2 = OrderFactory.createOrder();
        Order o3 = OrderFactory.createOrder();

        List<Order> orders = new ArrayList<>(List.of(o1,o2,o3));
        //! Cria uma única lista de OrderItem contendo os elementos de cada lista de OrderItem dos objetos Order
        List<OrderItem> items = orders.stream().flatMap(o -> o.getItems().stream()).toList();

        for (OrderItem orderItem : items) {
            System.out.println(orderItem.getDescription() + ", " + orderItem.getPrice() + ", " + orderItem.getSubtotal());
        };

    }
}
