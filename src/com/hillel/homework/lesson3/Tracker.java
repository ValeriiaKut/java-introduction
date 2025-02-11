package com.hillel.homework.lesson3;

public class Tracker {
    public static void main(String[] args) {

        int steps = 10_000;
        float hours = 12;

        float c = steps / hours; // кількість кроків на годину
        float d = c / 1000; // кількість тисяч кроків на годину

        System.out.println("Кількість тисяч кроків на годину: " + d);
    }
}
