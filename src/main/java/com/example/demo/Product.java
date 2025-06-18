package com.example.demo;

public class Product {
    Integer productId;
    String name;
    String category; //for now
    Double price;

    Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
