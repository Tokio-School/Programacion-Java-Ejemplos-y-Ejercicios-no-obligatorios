package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;

public class Supplier extends Worker {
    private String van;

    public Supplier(String name, String surname, LocalDate birthDate, String address, String province, String city, float salary, String profile,
                    String van) {
        super(name, surname, birthDate, address, province, city, salary, profile);
        this.van = van;
    }
}
