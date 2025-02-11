package com.example.utils;

public class OrderItem {
    private String description;
    private Double price;
    private Integer quantity;
    
    public OrderItem() {
    }

    public OrderItem(String description, Double price, Integer quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotal(){
        return this.price * this.quantity;
    }

}
