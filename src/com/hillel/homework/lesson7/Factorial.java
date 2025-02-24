package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number to collect the factorial: ");

        int number = Integer.parseInt(br.readLine());
        int factorial = 1;
        while ( number > 0) {
            factorial *= number;
            number--;

        }

        System.out.println("The factorial  is " + factorial);

    }
}
