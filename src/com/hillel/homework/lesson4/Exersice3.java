package com.hillel.homework.lesson4;

import java.util.Scanner;

public class Exersice3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance: ");
        float distance = scanner.nextFloat();

        System.out.println("Enter gasoline: ");
        float gasoline = scanner.nextFloat();

        System.out.println("Fuel Consumption: " + calculateFuelConsumption(distance, gasoline));


    }
    public static float calculateFuelConsumption(float distance, float gasoline){
        return (gasoline / distance) * 100;
    }
}
