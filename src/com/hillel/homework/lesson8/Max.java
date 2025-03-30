package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Max {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("How many numbers in your array? ");
        int[] array = new int[Integer.parseInt(READER.readLine())];

        enterNumbers(array);

        max(array);


    }

    private static void enterNumbers(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + i + ": ");
            array[i] = Integer.parseInt(READER.readLine());
        }
        System.out.println(Arrays.toString(array));
    }

    public static void max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The max is " + max);
    }

}
