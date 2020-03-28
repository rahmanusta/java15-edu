package com.kodedu.switches;

public class App1 {

    public static void main(String[] args) {

        VehicleType vehicleType = VehicleType.AUTOMOBILE;

        int speedLimit = switch (vehicleType) {
            case BIKE, SCOOTER -> 40;
            case MOTORBIKE, AUTOMOBILE -> 140;
            case TRUCK -> 80;
            default -> throw new IllegalStateException("No case found for: " + vehicleType);
        };

        System.out.println("Speed limit: " + speedLimit);
    }
}
