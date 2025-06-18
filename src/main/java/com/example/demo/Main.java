package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}

class Product{
    Integer productId;
    String name;
    String Category; //for now
    Double price;
}

interface IProductDAO{
    public void add(Product product);
    public ArrayList<Product> getAll();
}

@Component
class SimpleProductDao implements IProductDAO{
    ArrayList<Product> list = new ArrayList<Product>();
    SimpleProductDao(){
        this.list.add(new Product());
    }
    public void add(Product product){

    }
    public ArrayList<Product> getAll(){
        ArrayList<Product> list = new ArrayList<Product>();
        //TODO populate
        return list;
    }
}
/*
Product - class - add the following members
-----------------------
productId - int
name - String
category - String (for now)
price - double (or BigDecimal)


ProductDao - interface - add the following method definitions
---------------------------------
add(Product product)
getAll()


SimpleProductDao - class - add the following members
------------------------------------
implement the ProductDao interface (methods will interact with the list)
private List<Product> products
Configure the SimpleProductDao class as a Bean by adding the @Component
annotation.
Add a constructor to the SimpleProductDao and add a few products to the list.
In your main method create a user interface that gives users the following
options:
1. List Products
2. Add Product
Using Dependency Injection, create a variable for your SimpleProductDao.
Use the DAO to store and retrieve products. DO NOT directly create a
SimpleProductDao with a call to the constructor.
 */
