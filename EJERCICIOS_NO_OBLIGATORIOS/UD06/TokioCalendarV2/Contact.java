package com.tokioschool.tokiocalendar.domain;

public class Contact {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private User user;

    public Contact(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public Contact(String name, String surname, String email, String phone, User user) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public User getUser() {
        return user;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Contact)) return false;

        Contact contact = (Contact) object;
        if (!contact.getEmail().equals(email))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + email + ")";
    }
}
