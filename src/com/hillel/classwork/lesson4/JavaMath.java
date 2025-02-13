package com.hillel.classwork.lesson4;

public class JavaMath {
    public static void main(String[] args) {


         int sm1 = 3_000;
         int sm2 = 4_500;
         int sm3 = 5_800;


        int monthsInTenYears = 120;


        int sy1 = sm1 * monthsInTenYears;
        int sy2 = sm2 * monthsInTenYears;
        int sy3 = sm3 * monthsInTenYears;
        System.out.println("Salary for 10 years 1 : " + sy1);
        System.out.println("Salary for 10 years 2 : " + sy2);
        System.out.println("Salary for 10 years 3 : " + sy3);

        float tax = 0.05f;

        double t1 = sy1 - (sy1 * tax);
        double t2 = sy2 - (sy2 * tax);
        double t3 = sy3 - (sy3 * tax);
        System.out.println("Salary after tax 1 : " + t1);
        System.out.println("Salary after tax 2 : " + t2);
        System.out.println("Salary after tax 3 : " + t3);

        double sum = (t1 + t2 + t3) / 3;
        System.out.println("Average salary for 10 years after tax : " + sum);



    }

    public static class Box {
        public static void main(String[] args) {

            int width = 100;
            int height = 300;
            int depth = 500;

            int volume = calculateVolume(width, height, depth);
            System.out.println("Volume is " + volume);

            System.out.println("Volume is " + (calculateVolume(45,437,5)));



        }

        public static int calculateVolume(int width, int height, int depth) {
            return width * height * depth;


        }

    }
}
