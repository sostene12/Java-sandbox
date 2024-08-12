package com.amigoscode;

public class Calculator {
    public int  add(int ...numbers){
        int sum = 0;
        for(int nbr: numbers){
            sum += nbr;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Calculator");
    }
}
