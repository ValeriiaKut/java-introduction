package com.hillel.homework.lesson3;

public class Exercise1 {
    public static void main(String[] args) {

        //Data

        float density = 0.7F;
        System.out.println("Snow density: " + density);

        float r1 = 1.0f;
        System.out.println("Sphere radii 1: " + r1);

        float r2 = 0.5f;
        System.out.println("Sphere radii 2: " + r2);

        float r3 = 0.2f;
        System.out.println("Sphere radii 3: " + r3);

        //Sphere volumes

        double v1 = ( (double) 4 /3 * Math.PI * Math.pow(1,3));
        double v2 = ( (double) 4 /3 * Math.PI * Math.pow(0.5,3));
        double v3 = ( (double) 4 /3 * Math.PI * Math.pow(0.2,3));
        double v =  v1 + v2 + v3;

        System.out.println("Sphere volume 1 : " + v1);
        System.out.println("Sphere volume 2 : " + v2);
        System.out.println("Sphere volume 3 : " + v3);
        System.out.println("Sphere volume total : " + v);

        //result

        double result = density * v;
        System.out.println("Snowman mass : " + result);


    }
}
