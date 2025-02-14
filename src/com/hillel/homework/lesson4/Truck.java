package com.hillel.homework.lesson4;

import java.util.Scanner;

public class Truck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the track: ");
        int length = sc.nextInt();

        System.out.println("Enter width of the track: ");
        int width = sc.nextInt();

        System.out.println("Enter height of the track: ");
        int height = sc.nextInt();

        System.out.println("Enter Kilograms for 1 meter^3: ");
        int weight = sc.nextInt();

        System.out.println("Volume is " + calculateVolume(length, width, height) + " m^3.");
        System.out.println("Maximum weight is " + totalWeight(length,width,height,weight) + " kg.");


    }
    public static int calculateVolume(int length, int with, int height) {
        return length * with + height;
    }

    public static int totalWeight(int length, int with, int height, int weight) {
        return length * with + height * weight;
    }
}
