package com.kodedu.switches;

public class SwitchApp2 {

    public static void main(String[] args) {

        int speedLimit = getSpeedLimit(VehicleType.AUTOMOBILE);
        System.out.println("Speed limit: " + speedLimit);

    }

    private static int getSpeedLimit(VehicleType vehicleType) {
        return switch (vehicleType) {
            case BIKE, SCOOTER -> 40;
            case MOTORBIKE, AUTOMOBILE -> 140;
            case TRUCK -> 80;
        };
    }
}
