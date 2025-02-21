package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        int number = Integer.parseInt(br.readLine());

        System.out.println("Enter an action: ");
        String action = br.readLine();

        System.out.println("Enter a second number: ");
        int secondNumber = Integer.parseInt(br.readLine());

        actions(action, number, secondNumber);

    }

    private static void actions(String action, int number, int secondNumber) {
        switch (action) {
            case "+":
                int sum = number + secondNumber;
                System.out.println("You entered: " + number + " " + action + " " + secondNumber + " = " + sum);
                break;
            case "-":
                int difference = number - secondNumber;
                System.out.println("You entered: " + number + " " + action + " " + secondNumber + " = " + difference);
                break;
            case "*":
                int multiplication = number * secondNumber;
                System.out.println("You entered: " + number + " " + action + " " + secondNumber + " = " + multiplication);
                break;
            case "/":
                int division = number / secondNumber;
                System.out.println("You entered: " + number + " " + action + " " + secondNumber + " = " + division);
                break;
            case "%":
                int remainder = number % secondNumber;
                System.out.println("You entered: " + number + " " + action + " " + secondNumber + " = " + remainder);
                break;
            default:
                System.out.println("Invalid action.");
                break;
        }
    }
}
