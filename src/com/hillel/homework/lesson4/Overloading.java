package com.hillel.homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overloading {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first word: ");
        String word = reader.readLine();

        System.out.println("Enter second word: ");
        String word2 = reader.readLine();

        concatAndPrint(word, word2);

        System.out.println("Enter third word: ");
        String word3 = reader.readLine();

        System.out.println("Enter fourth word: ");
        String word4 = reader.readLine();

        System.out.println("Enter number: ");
        int number = Integer.parseInt(reader.readLine());


        concatAndPrint(word3, word4, number);

    }

    public static void concatAndPrint(String word, String word2) {

        System.out.println(word + " " + word2);
    }


    public static void concatAndPrint(String word3, String word4, int number) {
        System.out.println(word3 + " " + word4 + " " + number);
    }


}
