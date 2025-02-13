package com.hillel.homework.lesson4;

import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of grams: ");
        int grams = scanner.nextInt();

        System.out.println("Enter number of  times: ");
        int times = scanner.nextInt();

        System.out.println("Enter number of days: ");
        int days = scanner.nextInt();

        System.out.println("Enters number of cats: ");
        int cats =  scanner.nextInt();

        System.out.println("Enters number of dogs: ");
        int dogs = scanner.nextInt();

        System.out.println("Enters number of costs for 1 meal: ");
        int cost =  scanner.nextInt();

        int mealForCats = food( grams, times, days, cats);

        int mealForDogs = food( grams, times, days, dogs);

        int totalCost = calculateTotalCost( cost, times, days,dogs + cats) ;

        System.out.println("Food required for cats per month: " + mealForCats + " grams");
        System.out.println("Food required for dogs per month: " + mealForDogs + " grams");
        System.out.println("Total cost per month: $" + totalCost);

    }

    public static int food (int grams, int times, int days, int animals){
        return grams * times * days * animals;
    }

    public static int calculateTotalCost(int cost, int times, int days, int animals){
        return cost * times * days * animals;
    }
}
