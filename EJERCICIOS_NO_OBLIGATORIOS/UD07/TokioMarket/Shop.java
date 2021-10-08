package com.tokioschool.tokiomarket.domain;

import java.util.List;

public class Shop {
    private String name;
    private String address;
    private int size;
    private List<Product> stock;
    private String calendar;
    private int workerCount;

    public Shop(String name, String address, int size, List<Product> stock, String calendar, int workerCount) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.stock = stock;
        this.calendar = calendar;
        this.workerCount = workerCount;
    }
}
