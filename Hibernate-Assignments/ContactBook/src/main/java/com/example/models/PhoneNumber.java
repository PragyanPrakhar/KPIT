package com.example.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class PhoneNumber {
    private String home;
    private String mobile;

    public PhoneNumber() {}

    public PhoneNumber(String home, String mobile) {
        this.home = home;
        this.mobile = mobile;
    }

    public String getHome() { return home; }
    public void setHome(String home) { this.home = home; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    @Override
    public String toString() {
        return "Home: " + home + ", Mobile: " + mobile;
    }
}
