package com.hillel.homework.lesson3;

public class Tracker {
    public static void main(String[] args) {

        int steps = 10_000;
        float hours = 12;

        float sh = steps / hours; // кількість кроків на годину
        float result = sh / 1000; // кількість тисяч кроків на годину

        System.out.println("Number of thousands of steps per hour: " + result);

    }
}
