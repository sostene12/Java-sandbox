package com.amigoscode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
         Map<Person,Diamond> map = new HashMap<>();
         map.put(new Person("Jamila"),new Diamond("African Diamond"));
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
         System.out.println(map.get(new Person("Jamila"))) ;
    }

    private static void maps() {
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("kaleb"));
        map.put(2,new Person("Josh"));
        map.put(3,new Person("Mary"));
        map.put(4,new Person("Joselyne"));
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(8));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        map.entrySet().forEach(System.out::println);
        map.remove(3);

        map.entrySet().forEach(data -> System.out.println(data.getKey() + " " + data.getValue()));
        map.forEach(((key, person) -> {
            System.out.println(key+ " - " + person);
        }));

        System.out.println(map.getOrDefault(3,new Person("default ")));
        System.out.println(map.values());
    }

//    record Person(String name){};
    record Diamond(String name){};

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
