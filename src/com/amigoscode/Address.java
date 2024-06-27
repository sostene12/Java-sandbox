package com.amigoscode;

import java.util.Objects;

public class Address {
    private String firstLIne;
    private String postCode;
    private String country;

    public Address(String firstLIne, String postCode, String country) {
        this.firstLIne = firstLIne;
        this.postCode = postCode;
        this.country = country;
    }

    public String getFirstLIne() {
        return firstLIne;
    }

    public void setFirstLIne(String firstLIne) {
        this.firstLIne = firstLIne;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(firstLIne, address.firstLIne) && Objects.equals(postCode, address.postCode) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstLIne, postCode, country);
    }
}
