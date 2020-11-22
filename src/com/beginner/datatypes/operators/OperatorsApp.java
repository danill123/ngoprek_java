package com.beginner.datatypes.operators;

public class OperatorsApp {
    public static void main(String[] args) {
        String carModel = "Dodge CHallanger SRT 392";
        int price = 14999;
        int moneyIsTHeBank = 100000;
        boolean isDamage = true;

        System.out.println("Price: " + price);
        int priceINcrese = price + 100;
        System.out.println("INcrease price = " + priceINcrese);
        int priceDecrease = price - 1000;
        System.out.println("Decrease price " + priceDecrease);
        int dodge = price * 2;
        System.out.println("Two cars price : " + dodge);
        int moneyResein = moneyIsTHeBank % price;
        System.out.println("Money I'll have after buying " + dodge + "Dodge Challanger ");

        int priceNegative = 15999;
        int priceNegativeWIthPlusSign = +priceNegative;
        System.out.println(" Negative with plush sign " + priceNegativeWIthPlusSign);
        int pricenegativeminussign = -priceNegative;
        System.out.println(" negative with minus sign " + pricenegativeminussign);
        price++;
        int priceNODecresea = price++;
        System.out.println("Price after one price increate " + priceNODecresea);
        System.out.println("price equal" + (price == moneyIsTHeBank));
        System.out.println("not equal " + (price != moneyIsTHeBank));
        System.out.println("greather " + (price < moneyIsTHeBank));
        System.out.println("instance " + carModel instanceof String);
        System.out.println();

        String damagedText = !isDamage || price < 200 ? " the car is damaged" : "this car isn't damaged";
        System.out.println("damaged text " + damagedText);
        String worhpairing = isDamage && price < 1000 ? "its worth repairing car" : "not worth";
        System.out.println(worhpairing);
        System.out.println();


    }
}
