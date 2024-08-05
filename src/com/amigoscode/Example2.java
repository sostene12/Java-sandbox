package com.amigoscode;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("1");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);

        Map<String,String> map = new HashMap<String,String>();
        Map<Point,Double> map2 = new HashMap<Point,Double>();


    }

    private static void comparable() {
        Comparable<Integer> number = 10;
        System.out.println( number.compareTo(13));
    }
}
