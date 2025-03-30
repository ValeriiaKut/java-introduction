package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex5 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("How many numbers you have in your pin? ");
        int[] pin = new int[Integer.parseInt(READER.readLine())];

        for (int i = 0; i < pin.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            pin[i] = Integer.parseInt(READER.readLine());
        }
        System.out.print("Your pin is:  ");
        pin(pin);

        System.out.println("Now I try to guess your pin:");

        int[] guessPin = new int[pin.length];

        boolean found = false;
        int attempts = 0;

        while (!found) {
            for (int i = 0; i < pin.length; i++) {
                guessPin[i] = randomNumber();
            }
            attempts++;

            if (Arrays.equals(pin, guessPin)) {
                System.out.println("Guessed PIN: " + Arrays.toString(guessPin) + " in " + attempts + " attempts!");
                found = true;
            }

    }


    }



    public static int randomNumber() {
        return (int) ((Math.random() * 10));
    }

    public static void pin(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
    }


}
