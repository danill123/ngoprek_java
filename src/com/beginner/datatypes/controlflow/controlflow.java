package com.beginner.datatypes.controlflow;

public class controlflow {
    public static void main(String[] args) {
        boolean isDamaged = true;
        String carcolor = "purple";
        char energyEfficientCategory = 'G';

        if(isDamaged) {
            System.out.println("damaged car");
        } else {
            System.out.println("Accident free cars");
        }

        if(carcolor.equals("red")) {
            System.out.println("yes red bichis");
        } else if(carcolor.equals("puple")) {
            System.out.println("purple bichis");
        } else {
            System.out.println("wrong color bitch");
        }

        switch (energyEfficientCategory) {
            case 'G':
                System.out.println("hello");
                break;
            default:
                System.out.println("ngga ada bacot");
                break;
        }

        {
            int numberOfOwners = 5;
            {
                numberOfOwners++;
            }
            System.out.println("number of owners column " + numberOfOwners);
        }

    }
}
