package com.amigoscode;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Integer[] myNumbers={1,3,4};
        Double[] mydoubles = {1.4,4.7,7.0,30.1};
        System.out.println(countGreaterThan(myNumbers,2));
        System.out.println(countGreaterThan(mydoubles,1.8));
    }

    interface  A{ }

    interface  B{}
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number){
       int count = 0;
       for(T n : numbers){
           if(n.compareTo(number) > 0){
               count++;
           }
       }
       return count;
    }
}
