package com.hillel.homework.lesson7;

public class Exersice2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++ ) {

            if (!Integer.toString(i).contains("4") && !Integer.toString(i).contains("9")){

                System.out.println(i);
            }

        }

    }
}
