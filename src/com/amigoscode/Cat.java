package com.amigoscode;

public class Cat {
    private String name;
    public  void meow(){
        System.out.println(name + ": meow...");
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
