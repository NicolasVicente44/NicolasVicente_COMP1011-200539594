package com.example.nicolasvicente_comp1011200539594;

public class Adult extends Patient {
    public Adult(String name, String address, String province) {
        super(name, address, province);
    }


    @Override
    public double getDiscount() {
        return 0.10; // 10% discount for youth patients
    }

    @Override
    public double getTaxRate() {
        if (getProvince().equalsIgnoreCase("Alberta")) {
            return 0.06; // 6% tax rate for Alberta
        } else if (getProvince().equalsIgnoreCase("Ontario")) {
            return 0.13; // 13% tax rate for Ontario
        } else if (getProvince().equalsIgnoreCase("Quebec")) {
            return 0.05; // 5% tax rate for Quebec
        } else {
            return 0.0; // No tax rate for other provinces
        }
    }
}
