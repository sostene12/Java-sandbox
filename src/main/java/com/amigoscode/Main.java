package com.amigoscode;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 275
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String address = faker.address().fullAddress();
        System.out.println(name + " " + email +" " +address);
        }
}