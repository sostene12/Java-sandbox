package com.amigoscode;

public class TypeErasure {
    public class Node<T>{
        public T data;
        private Node<T> next;
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
}
