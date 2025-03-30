package com.hillel.homework.lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Ex2 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the even length of the array: ");
        int[] array = new int[Integer.parseInt(READER.readLine())];
        getNumbers(array);

        int[] array2 = new int[array.length / 2];

        for (int i = 0; i < array.length / 2; i++) {
            array2[i] = array[i];
        }

        System.out.println("The small array 1:");
        printArray(array2);
        System.out.println(Arrays.toString(array2));


        int[] array3 = new int[array.length - array2.length];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array[i + array2.length];
        }

        System.out.println("The small array 2:");
        printArray(array3);
        System.out.println(Arrays.toString(array3));


    }


    private static void getNumbers(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the " + i + "th number: ");
            array[i] = Integer.parseInt(READER.readLine());
            System.out.println(i + " index: " + array[i]);
        }
        printArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] numbers) {
        System.out.println("The array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " element: " + numbers[i]);
        }

    }

}





