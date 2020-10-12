package com.kodedu.instanceofs;

public class InstanceOfApp2 {

    public static void main(String[] args) {

        Object obj = "Hello world!";

        // legal usage
        if (obj instanceof String s && !s.isBlank()) {
            System.out.println("String: " + s);
        }

        // cannot resolve symbol 's'
//        if (obj instanceof String s || !s.isBlank()) {
//            System.out.println("String: " + s);
//        }
    }
}
