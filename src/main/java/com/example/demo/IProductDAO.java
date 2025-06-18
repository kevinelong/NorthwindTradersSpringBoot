package com.example.demo;

import java.util.ArrayList;

public interface IProductDAO{
    public void add(Product product);
    public ArrayList<Product> getAll();
}
