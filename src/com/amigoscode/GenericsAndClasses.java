package com.amigoscode;

public class GenericsAndClasses {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();

        box.set(new Phone("Infinix"));
        System.out.println(box.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("kiki"));
        System.out.println(box2.get());
    }
}
