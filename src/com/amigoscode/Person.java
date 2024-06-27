package com.amigoscode;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private  String lastName;
    private  String firstName;
    private Gender gender;
    private Cat[] cats;


    public Person(String lastName, String firstName, Gender gender, Cat[] cats) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.cats = cats;
    }

    public Person(String lastName, String firstName, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName) && gender == person.gender && Objects.deepEquals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, gender, Arrays.hashCode(cats));
    }
}
