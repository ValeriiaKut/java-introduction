package com.hillel.homework.lesson6;

public class Exercise1 {
    public static void main(String[] args) {
        double random1 =  random();
        double random2 = random();
        double random3 = random();

        System.out.println((int)random1);
        System.out.println((int)random2);
        System.out.println((int)random3);

        if ( random1 < random2 && random1 < random3 ) {
            System.out.println("min = " + (int)random1);
        } else if ( random2 < random1 && random2 < random3 ) {
            System.out.println("min = " + (int)random2);
        } else {
            System.out.println("min = " + (int)random3);
        }
    }
    public static double random() {
        return Math.random() * 100;
    }
}
