package com.example.utils;

public class Person{
    private String name;
    private Integer age;
    private Double height;
    private Double weight;

    public Person(){

    }

    public Person(String name, Integer age, Double height, Double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
        .append("Person = ")
        .append("{ ")
        .append("Nome: ").append(this.name).append(", ")
        .append("Idade: ").append(this.age).append(", ")
        .append("Altura: ").append(this.height).append(", ")
        .append("Peso: ").append(this.weight).append(" }");

        return sb.toString();
    }
}

