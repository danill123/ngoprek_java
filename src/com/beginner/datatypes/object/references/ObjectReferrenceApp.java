package com.beginner.datatypes.object.references;

public class ObjectReferrenceApp {
    public static void main(String[] args){
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNUmber = 23214242313213L;

        Float fuelConsumptionUrban = 15.5F;
        Double fuelConsumptionAverage = 15.2321332;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carType = "Dodge CHallanger SRT 392";
        String carTypeWithNewKeyword = new String("Dodge Challanger SRT 392");

        System.out.println("Number Of Seas " + numberOfSeats);
        System.out.println("horse power " + horsePower + "hp");
        System.out.println("price " + price.floatValue());
        System.out.println("Registration " + registrationNUmber);
        System.out.println("Fuel " + fuelConsumptionUrban);
        System.out.println("Precise average fuel consumption " + fuelConsumptionAverage.intValue());
        System.out.println("THe car is damaged " + isDamaged);
        System.out.println("ENergey efficiency " + energyEfficiencyCategory);
        System.out.println("cARTYPE uppercase = " + carType.toUpperCase());
        System.out.println("car cmodu " + carTypeWithNewKeyword);

    }
}
