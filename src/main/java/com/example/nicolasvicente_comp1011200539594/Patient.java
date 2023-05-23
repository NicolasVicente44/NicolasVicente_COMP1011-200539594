package com.example.nicolasvicente_comp1011200539594;

public abstract class Patient {
    private String name;
    private String address;
    private String province;

    public Patient(String name, String address, String province) {
        this.name = name;
        this.address = address;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProvince() {
        return province;
    }

    public abstract double getDiscount();
    public abstract double getTaxRate();
}
