package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exersice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter length: ");
        float length = Float.parseFloat(reader.readLine());

        System.out.println("Enter height: ");
        float height = Float.parseFloat(reader.readLine());

        System.out.println("Enter width: ");
        float width = Float.parseFloat(reader.readLine());

         size1(length, height, width);
         size2(length, height, width);



    }
    private static boolean size1(float length, float height, float width) {
        if (length <= 0 || height <= 0 || width <= 0) {
            System.out.println("Invalid numbers.");
            return false;
        } else if (length <= 40 && height <= 55 && width <= 20) {
            System.out.println("Your bag is perfect for size 1.");
            return true;
        } else {
            System.out.println("Your bag is too big for size 1.");
            return false;
        }
    }

    private static boolean size2(float length, float height, float width) {
        if (length <= 0 || height <= 0 || width <= 0) {
            System.out.println("Invalid numbers.");
            return false;
        } else if (length <= 53 && height <= 40 && width <= 22) {
            System.out.println("Your bag is perfect for size 2.");
            return true;
        } else {
            System.out.println("Your bag is too big for size 2.");
            return false;
        }
    }



}
