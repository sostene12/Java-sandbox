package com.amigoscode;

public class GenericAndMethods {
    public static void main(String[] args) {
        String[] names = {"Ali","Jamila"};
        Character[] letters = {'A','B','C'};
        Double[] numbers = {1.1,2.2,3.3};
        print(names);
        print(letters);
        print(numbers);
    }

    static <T> void  print(T[] array){
        for(T e:array){
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
