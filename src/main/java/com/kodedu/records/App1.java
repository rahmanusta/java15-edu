package com.kodedu.records;

public class App1 {

    public static void main(String[] args) {

        Point point = new Point(2, 3);

        System.out.println(point);

        int x = point.x();
        int y = point.y();
        System.out.format("X: %d, Y: %d", x, y);
    }
}


