package com.amigoscode;

import java.util.Objects;

public class Phone {
    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }
}
