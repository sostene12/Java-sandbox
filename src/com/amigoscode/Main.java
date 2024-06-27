package com.amigoscode;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 151
//        Classes
        Cat cat1 = new Cat("Rose",5,"Blue");

        Cat cat2 = new Cat("Rose",5,"Blue");

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        Cat[] cats = {cat1,cat2};
        Person alex = new Person("Alex","Montana",Gender.MALE, cats);
        System.out.println(alex);

    }
}