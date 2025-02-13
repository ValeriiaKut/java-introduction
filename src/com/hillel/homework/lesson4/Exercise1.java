package com.hillel.homework.lesson4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Airplane's name: ");
        String airplaneName = sc.nextLine();

        System.out.println("Enter Airplane's type: ");
        String airplaneType = sc.nextLine();

        printAirplaneInfo(airplaneName, airplaneType);


        System.out.println("Enter second Airplane's name: ");
        String airplaneName1 = sc.nextLine();

        System.out.println("Enter Airplane's type: ");
        String airplaneType1 = sc.nextLine();

        System.out.println("Enter nuber of econom seats: ");
        int economSeats = sc.nextInt();

        printAirplaneInfo(airplaneName1, airplaneType1, economSeats);

        System.out.println("Enter third Airplane's name: ");
        String airplaneName2 = sc.nextLine();

        System.out.println("Enter Airplane's type: ");
        String airplaneType2 = sc.nextLine();

        System.out.println("Enter nuber of econom seats: ");
        int economSeats1 = sc.nextInt();

        System.out.println("Enter number of business seats: ");
        int businessSeats = sc.nextInt();

        printAirplaneInfo(airplaneName2, airplaneType2, economSeats1, businessSeats);


    }
    public static void printAirplaneInfo(String airplaneName, String airplaneType) {
        System.out.println("The name of airplane: " + airplaneName + " The type of airplane: " + airplaneType);

    }

    public static void printAirplaneInfo(String airplaneName1, String airplaneType1, int economSeats) {
        System.out.println("The name of airplane: " + airplaneName1 + ", The type of airplane: " + airplaneType1 + ", The number of econom seats: " + economSeats);
    }

    public static void printAirplaneInfo(String airplaneName2, String airplaneType2, int economSeats1, int businessSeats) {
        System.out.println(
                "The name of airplane: " + airplaneName2 + ", The type of airplane: " + airplaneType2 + ", The number of econom seats: " + economSeats1 + ", The number of business seats: " + businessSeats
        );
    }

}
