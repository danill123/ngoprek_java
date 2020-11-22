package com.beginner.datatypes;

public class MyFIrstJavaApp {
    public static void main(String[] args) {
        int numberOfFollowers = 10;
        byte numberOfSeats = 4;
        byte emissionSticker = 4;
        byte numberOfDoors = 2;

        short power = 342;
        short horsePower = 492;
        short co2EMission = 492;
        short cubicCpacity = 6417;
        int price = 2999;
        int mileage = 14999;

        long registrationNumber = 12321323123231L;

        float fuelConsumtionCombined = 15.5F;
        float fuelConsumptionUrban = 15.5F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 1523321323;

        boolean isDamage = true;
        char energyEfficientCategory = 'G';

        float changed = (float) registrationNumber;

        System.out.println(" data type " + energyEfficientCategory);
        System.out.println(" Hello Bitch " + changed);
        System.out.println(" byte data : " + numberOfDoors);
        System.out.println(" float " + fuelConsumptionExtraUrban);
        System.out.println(" short " + co2EMission);

        System.out.println("conversion");
        short changed2 = numberOfSeats;
        System.out.println("Raw values of number seats" + changed2);
        int newmilead = mileage;
        System.out.println("new mileage" + newmilead);
        byte newPower = (byte) power;
        System.out.println("old power " + power + " new power " + newPower);
    }
}
