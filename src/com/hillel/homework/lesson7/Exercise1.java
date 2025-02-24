package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int random = (int) (Math.random() * 11) ;

        int number = -1;

        System.out.println("Enter a number between 0 and 10: ");


        while (number !=random) {

            number = Integer.parseInt(READER.readLine());

            if (number == random){
                System.out.println("You win");
                break;
            }
            else if (number < random) {
                System.out.println("random number is bigger than " + number);
            }
            else {
                System.out.println("random number is smaller than " + number);
            }
            System.out.println("Enter a number between 0 and 10: ");
            }
        }
    }




