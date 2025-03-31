package com.example.models;

import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "home", column = @Column(name = "home_phone")),
        @AttributeOverride(name = "mobile", column = @Column(name = "mobile_phone"))
    })
    private PhoneNumber phone;

    public Contact() {}

    public Contact(String name, PhoneNumber phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public PhoneNumber getPhone() { return phone; }
    public void setPhone(PhoneNumber phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phone;
    }
}