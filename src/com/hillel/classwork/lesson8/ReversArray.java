package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversArray {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the length of the array: ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];


        getNumber(numbers);
        printArray(numbers);

    }

    private static void getNumber(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + i + "th number: ");
            numbers[i] = Integer.parseInt(READER.readLine());
            System.out.println(i + " index: " + numbers[i]);
        }
    }
    public static void printArray(int[] numbers) {
        System.out.println("Reverse Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(i + " element: " + numbers[i]);
        }
    }

}

