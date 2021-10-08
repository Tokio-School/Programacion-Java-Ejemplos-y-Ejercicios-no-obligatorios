package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;

public class SuperCustomer extends AbstractCustomer implements Customer {

    public SuperCustomer(String name, String surname, LocalDate birthDate, String address, String province, String city, float discount) {
        super(name, surname, birthDate, address, province, city, discount);
    }

    public SuperCustomer() {

    }

    @Override
    public void pay() {

    }

    public void send() {

    }
}
