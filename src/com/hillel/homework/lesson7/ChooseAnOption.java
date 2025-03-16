package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseAnOption {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String option = "";

        while (!option.equals("stop")) {

            System.out.println("Choose an option (+,-,/,*): ");
            option = br.readLine();

            System.out.println("Enter a number 1: ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter a number 2: ");
            int num2 = Integer.parseInt(br.readLine());

            switch (option) {
                case "+":
                    System.out.println("The answer is: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The answer is: " + (num1 - num2));
                    break;
                case "/":
                    System.out.println("The answer is: " + (num1 / num2));
                    break;
                case "*":
                    System.out.println("The answer is: " + (num1 * num2));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }

        }


    }
}
