package com.beginner.datatypes.controlflow;

public class learncontrolflow2 {
    public static void main(String[] args) {
        char answer = 'C';
        System.out.println("Who is name as the inventer of the light bulb");
        System.out.println("You marked " + answer + ". lets see weather you're right");

        if(answer == 'G') {
            System.out.println("You were right. You win $1");
        } else {
            System.out.println("sorry youre right answer is thomas");
        }
    }
}
