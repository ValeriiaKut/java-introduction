package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex4 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("Enter the  length of the triangle: ");
        String[] triangle = new String[Integer.parseInt(READER.readLine())];


        triangle(triangle);

        System.out.println("Enter the length of the square: ");
        String[] square = new String[Integer.parseInt(READER.readLine())];

        square(square);

    }

    public static void triangle(String[] array) throws InterruptedException {
        for (int i = 0; i < array.length; i++) {
            Thread.sleep(1000);
            array[i] = " # ";
            if (i > 0) {
                array[i] = array[i - 1] + array[i];
                System.out.println(array[i]);
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static void square(String[] square) throws InterruptedException {
        for (int i = 0; i < square.length; i++) {
            Thread.sleep(1000);
            square[i] = " * " ;
            for (int j = 0; j < square.length - 1; j++) {
                 square[j] = " * ";
                System.out.print(square[j]);
            }

            System.out.println(square[i]);


        }
    }



}

