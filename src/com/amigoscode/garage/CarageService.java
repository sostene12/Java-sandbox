package com.amigoscode.garage;

import com.amigoscode.car.Car;

public class CarageService {

    public boolean addCarToGarage(Car car, Garage garage){
        if(car == null){
            throw new IllegalArgumentException("Car can not be null");
        }
        int count = 0;
        for (Car c: garage.getCars()){
            if(c != null){
                count++;
            }
        }
        if(count >= garage.getCapacity()){
            return  false;
        }

        // add the car to the garage

        return true;
    }

}
