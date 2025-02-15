package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exersice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter length: ");
        int length = Integer.parseInt(reader.readLine());

        System.out.println("Enter height: ");
        float height = Float.parseFloat(reader.readLine());

        System.out.println("Enter width: ");
        float width = Float.parseFloat(reader.readLine());

        if (length <= 0 || height <= 0 || width <= 0) {
            System.out.println("Invalid numbers.");
        } else if (length <= 55 && height <= 40 && width <= 22) {
            System.out.println("Your bag is perfect.");
        } else {
            System.out.println("Your bag is too big.");
        }


    }
}
