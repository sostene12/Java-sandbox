package com.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("George",30));
        linkedList.add(new Person("David",40));
        linkedList.addLast(new Person("John",20));
        linkedList.addFirst(new Person("Mary",18));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Kaleb",20));
        supermarket.add(new Person("Eudoxie",35));
        supermarket.add(new Person("Ange",24));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
//        supermarket.remove();
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){ }
}
