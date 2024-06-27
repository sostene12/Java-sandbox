package com.amigoscode;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 155
        Address address = new Address("foobar st","00000","Rwanda");
        Car car1 = new Car(CarBrand.TESLA,new BigDecimal("85000"));
        Car car2 = new Car(CarBrand.BMW,new BigDecimal("50000"));
        Car[] cars = {car1,car2};

        Person alex = new Person("Alex",22,address, cars);
        System.out.println(alex);
    }

}