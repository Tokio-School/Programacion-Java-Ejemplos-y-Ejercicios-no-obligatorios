package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;

public class Worker extends Person {

    private float salary;
    private String profile;

    public Worker(String name, String surname, LocalDate birthDate, String address, String province, String city, float salary, String profile) {
        super(name, surname, birthDate, address, province, city);
        this.salary = salary;
        this.profile = profile;
    }

    public void close() {

    }

    public void supply() {

    }
}
