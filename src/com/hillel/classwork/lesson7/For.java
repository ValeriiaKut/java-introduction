package com.hillel.classwork.lesson7;

public class For {
    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }


        for (int i = 0; i <= 100;  i++) {
            if ( i % 4 == 0 ||  i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 100;  i = i + 2) {
                System.out.println(i);

        }

        for (int i = 0; i <= 10;  i++) {
            if ( i % 2 != 0) {
               continue;
            }
            System.out.println(i);
        }



    }
}
