package com.kodedu.instanceofs;

public class InstanceOfApp1 {

    public static void main(String[] args) {

        Object obj = "Hello world!";

        // before
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("String: " + s);
        }

        // after
        if (obj instanceof String s) {
            System.out.println("String: " + s);
        }
    }
}
