package com.amigoscode.car;

public class  CarService {

    private CarDAO CarDAO;

    public CarService() {
        this.CarDAO = new CarDAO();
    }

    public int registerNewCar(Car car){
//        check if a car is not null
//        check if reg number is valid
//        check if reg number not taken
//        if price is less than 0
        CarDAO.saveCar(car);
        return 1;
    }

    public  Car[] getCars(){
        return CarDAO.selectAllCars();
    }

}
