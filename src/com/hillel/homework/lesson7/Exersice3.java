package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exersice3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number of dirty cars:");

        int cars = Integer.parseInt(br.readLine());

        // while
        int i = 1;
        while (i <= cars) {

            System.out.println(i + " car: ");

            latherCar();
            washCar();
            dryCar();
            i++;

        }

        // for



        System.out.println("Enter a number of dirty cars:");

        int cars1 = Integer.parseInt(br.readLine());

        for (int j = 1; j <= cars1; j++){

            System.out.println(j + " car: ");
            latherCar();
            washCar();
            dryCar();


        }

        // do while
        System.out.println("Enter a number of dirty cars:");

        int cars3 = Integer.parseInt(br.readLine());

        int a = 1;

         do{
             System.out.println(a + " car: ");
             latherCar();
             washCar();
             dryCar();
             a++;

         } while (a <= cars3);



    }
    public static void latherCar() {

        System.out.println("Car is lathered");
    }
    public static void washCar() {
        System.out.println("Car is washed");
    }

    public static void dryCar() {
        System.out.println("Car is dried");
    }

}
