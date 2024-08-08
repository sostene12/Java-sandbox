package com.amigoscode;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildcards {
    public static void main(String[] args) {
//         wildcards
        List<Object> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(1,2);
        List<String> list3 = Arrays.asList("1","2");
        print(list1);
        print(list2);
        print(list3);
    }

    //    ? wildcards ( unbounded )
    static void print(List<?> lists){
//        lists.forEach(System.out::println);
        lists.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
