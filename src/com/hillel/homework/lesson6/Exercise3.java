package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter amount of apples: ");
        int apples = Integer.parseInt(br.readLine());

        int big = apples / 5;
        System.out.println("You have " + big + " big jars.");

        int remainder = remainder(apples, 5);

        int average = remainder / 3;
        System.out.println("You have " + average + " average jars.");

        int small = remainder(remainder,3) ;
        System.out.println("You have " + small + " small jars.");

    }

    public static int remainder(int a,int b){
        return a % b;
    }
}
