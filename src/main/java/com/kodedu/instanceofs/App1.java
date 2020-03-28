package com.kodedu.instanceofs;

public class App1 {

    public static void main(String[] args) {

        Object obj = "Merhaba Dünya";

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
