package com.amigoscode;

public class Cat {
    private String name;
    private int age;

    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    public  void meow(){
        System.out.println(name + ": meow...");
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
