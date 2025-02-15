package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameForMoney {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of your points: : ");
        int points = Integer.parseInt(br.readLine());

        if (points >= 0 && points < 100) {
            System.out.println("You don't have enough points to win money!");
        } else if (points >= 100 && points < 500) {
            System.out.println("You win 10000$!");
        } else if (points >= 500 && points < 1000) {
            System.out.println("You  win 20000$!");
        } else {
            System.out.println("You win 50000$!");
        }

    }

}
