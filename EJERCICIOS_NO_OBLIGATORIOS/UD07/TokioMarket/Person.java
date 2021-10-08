package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String address;
    private String province;
    private String city;

    public Person(String name, String surname, LocalDate birthDate, String address, String province, String city) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.province = province;
        this.city = city;
    }

    public Person() {

    }

    public void changeAddress(String newAddress) {

    }

    public boolean isBirthDay() {
        return false;
    }
}
