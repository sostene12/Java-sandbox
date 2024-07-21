package com.amigoscode;

public class ElectricScooter implements Vehicle {
    private int currentSpeed;

    public ElectricScooter() {
    }

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public  void move(int amount){
        this.currentSpeed+=amount;
    }

    @Override
    public  void applyBreaks(int amount){
        this.currentSpeed-=amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
