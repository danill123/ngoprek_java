package com.beginner.datatypes.function;

public class functions {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(9);
        System.out.println("The price with 10% off" + getListofdiscountprice(10) );
        System.out.println("discount 50 % " + getDiscountPrice(2000, 50));
        System.out.println("dicount 20% anjay " + getDiscountPrice(1000, 10));
        getEnergyEfficiency('a');
        getCarDescription("tesla", 2018, "new");
        int[] tested = {1, 2, 3, 4, 4};
    }

    static void sayHello() {
        System.out.println("Hello dude");
    }

    static void blackboardPunishment(int repeatnumber) {
        for(int i = 1; i < repeatnumber; i++) {
            System.out.println(" sucks " + i);
        }
    }

    static double getListofdiscountprice(int price) {
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent) {
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent) {
        return price * percent / 100.0;
    }

    static void getEnergyEfficiency(char category) {
        switch (category) {
            case 'A':
            case 'a':
                System.out.println("very low energy consumption");
                break;
            case 'B':
            case 'b':
                System.out.println("very low energy consumption");
                break;
            case 'C':
            case 'c':
                System.out.println("very low energy consumption");
                break;
            case 'D':
            case 'd':
                System.out.println("Extremely high energy consumption");
                break;
            default:
                System.out.println("not define category");
        }
    }

    static void getCarDescription(String model, int productionyear, String condition)
    {
        System.out.println("This car is a " + model);
        System.out.println("Production Year " + productionyear);
        System.out.println(" It is in : " + condition + " condition ");
    }
}
