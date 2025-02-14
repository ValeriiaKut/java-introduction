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

        System.out.println("Enter Max maxWeight for 1 meter^3: ");
        int maxWeight = sc.nextInt();

        int volume = calculateVolume(length, width, height);

        System.out.println("Volume is " + volume + " m^3.");
        System.out.println("Maximum maxWeight is " + totalWeight(volume,maxWeight) + " kg.");


    }
    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static int totalWeight(int volume, int maxWeight) {
        return  volume * maxWeight;
    }
}
