package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SimpleProductDao implements IProductDAO{
    ArrayList<Product> list = new ArrayList<Product>();
    SimpleProductDao(){

        this.list.add(new Product("Apple","Fruit",123.45));
        this.list.add(new Product("Banana","Fruit",12.50));
    }
    public void add(Product product){
        this.list.add(product);
    }
    public ArrayList<Product> getAll(){
        return list;
    }
}
