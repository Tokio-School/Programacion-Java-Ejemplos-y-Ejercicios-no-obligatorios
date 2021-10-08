package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;

public class GoldCustomer extends AbstractCustomer {


    public GoldCustomer(String name, String surname, LocalDate birthDate, String address, String province, String city, float discount) {
        super(name, surname, birthDate, address, province, city, discount);
    }

    public GoldCustomer() {

    }

    @Override
    public void pay() {

    }

    public void assist(String eventName) {

    }
}
