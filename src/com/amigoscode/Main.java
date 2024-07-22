package com.amigoscode;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 191
//        Polymorphism = many forms
//        Car - move,break,getCurrentSpeed
//        Bicycle - move,break,getCurrentSpeed
//        Electric Scooter - move,break,getCurrentSpeed
//        Vehicles
        Car car =  new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car,bicycle,electricScooter};

        Person person = new Person("Joseph",vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(10);
            System.out.println();
        }

        System.out.println(Vehicle.PURCHASE_RATE);
        System.out.println(car.milesToKm());


    }
}