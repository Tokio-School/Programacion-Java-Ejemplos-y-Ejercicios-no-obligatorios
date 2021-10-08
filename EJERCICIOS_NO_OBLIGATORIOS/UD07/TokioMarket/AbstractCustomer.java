package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCustomer extends Person implements Customer {

    private float discount;
    private List<Product> products;

    public AbstractCustomer(String name, String surname, LocalDate birthDate, String address, String province, String city,
                            float discount) {
        super(name, surname, birthDate, address, province, city);
        this.discount = discount;
        products = new ArrayList<>();
    }

    public AbstractCustomer() {

    }

    @Override
    public void buy(Product product) {

    }
}
