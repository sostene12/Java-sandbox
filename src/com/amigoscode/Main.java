package com.amigoscode;

import com.amigoscode.car.Car;
import com.amigoscode.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 171

        carsExample();

    }

    private static void carsExample() {
        Car car = new Car("1234", BigDecimal.TEN);

        CarService carService  = new CarService();

        carService.registerNewCar(car);

        System.out.println(Arrays.toString(carService.getCars()));
    }
}