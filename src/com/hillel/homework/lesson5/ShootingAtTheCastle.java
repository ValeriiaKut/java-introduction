package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShootingAtTheCastle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter distance: ");
        int distance = Integer.parseInt(br.readLine());

        //1
        if(distance >= 1000 && distance <= 1500) {
            System.out.println("The castle was hit. " +
                    "The distance is " + distance + " meters.");
        }
        else {
            System.out.println("The castle was not hit. " +
                    "The distance is " + distance + " meters.");
        }

        //2
        if(distance < 1000 || distance > 1500) {
            System.out.println("The castle was not hit. " +
                    "The distance is " + distance + " meters.");
        } else {
            System.out.println("The castle was hit. " +
                    "The distance is " + distance + " meters.");
        }


    }
}
