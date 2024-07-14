package com.amigoscode;

public class Manager extends  Employee{

    private int teamSize;

    public Manager(String name, String address, int age, String experience) {
        super(name, address, age, experience);
    }

    public void report(){
        System.out.println("Manager writing team report...");
    }
}
