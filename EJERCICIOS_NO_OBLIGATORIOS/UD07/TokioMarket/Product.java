package com.tokioschool.tokiomarket.domain;

import java.util.List;

public class Product {
    private String name;
    private String description;
    private float price;
    private List<String> category;

    public Product(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
