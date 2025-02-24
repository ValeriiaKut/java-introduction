package com.hillel.homework.lesson6;

public class Exercise1 {
    public static void main(String[] args) {
        int random1 = (int) random();
        int random2 = (int) random();
        int random3 = (int) random();

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        int min = Math.min(random1, Math.min(random2, random3));

        if (random1 == random2 && random2 == random3) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("Min = " + min);
        }
    }
    public static double random() {
        return Math.random() * 100;
    }
}
