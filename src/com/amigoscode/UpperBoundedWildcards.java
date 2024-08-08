package com.amigoscode;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
//         wildcards
        List<Double> list1 = Arrays.asList(1.3,2.0);
        List<Integer> list2 = Arrays.asList(1,2);
        List<Number> list3 = Arrays.asList();
        printNumbers(list1);
        printNumbers(list2);
        printNumbers(list3);
    }

//    ? wildcards
    static void printNumbers(List<? extends  Number> lists){
//        lists.forEach(System.out::println);
        lists.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
