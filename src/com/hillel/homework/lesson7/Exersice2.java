package com.hillel.homework.lesson7;

public class Exersice2 {

        public static void main(String[] args) {

            for (int i = 0; i <= 100; i++) {

                if (!containsUnluckyNumber(i)) {

                    System.out.println(i);
                }
            }
        }


        public static boolean containsUnluckyNumber(int number) {

            while (number > 0) {
                int digit = number % 10;
                if (digit == 4 || digit == 9) {
                    return true;
                }
                number /= 10;
            }
            return false;
        }
    }
