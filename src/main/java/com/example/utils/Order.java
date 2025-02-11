package com.example.utils;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Instant moment;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Instant moment, List<OrderItem> items) {
        this.moment = moment;
        this.items = items;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Double getTotal() {
        double total = 0;
        for (OrderItem orderItem : items) {
            total += orderItem.getSubtotal();
        }

        return total;
    }
}
