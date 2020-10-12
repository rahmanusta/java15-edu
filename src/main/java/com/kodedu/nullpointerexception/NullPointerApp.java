package com.kodedu.nullpointerexception;

public class NullPointerApp {

    /**
     * Enable flag to see helpful null pointer exception message
     * -XX:+ShowCodeDetailsInExceptionMessages
     *
     * helpful NLP is enabled by default from JDK 15
     */
    public static void main(String[] args) {

        Person person = new Person();
        person.address = new Address();
        String toUpperCase = person.address.street.toUpperCase();
        System.out.println(toUpperCase);

    }

    static class Person {
        Address address;
    }

    static class Address {
        String street;
    }
}
