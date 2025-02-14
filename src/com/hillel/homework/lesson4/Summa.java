package com.hillel.homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summa {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number int 1: ");
        int i = Integer.parseInt(reader.readLine());

        System.out.println("Enter a number int 2: ");
        int i1 = Integer.parseInt(reader.readLine());

        System.out.println("Summa of 2 ints: " + calculateTwoInts(i, i1));

        System.out.println("Enter a number long 1: ");
        long l = Long.parseLong(reader.readLine());

        System.out.println("Enter a number long 2: ");
        long l1 = Long.parseLong(reader.readLine());

        System.out.println("Summa of 2 longs: " + calculateTwoInts(l, l1));

        System.out.println("Enter a number double 1: ");
        double d = Double.parseDouble(reader.readLine());

        System.out.println("Enter a number double 2: ");
        double d1 = Double.parseDouble(reader.readLine());

        System.out.println("Summa of 2 doubles: " + calculateTwoInts(d, d1));

    }

    public static double calculateTwoInts(int i, int i1) {
        return i + i1;
    }

    public static double calculateTwoInts(long l, long l1) {
        return l + l1;
    }

    public static double calculateTwoInts(double d, double d1) {
        return d + d1;
    }
}
