package com.hillel.classwork.lesson3;

public class JavaMath {
    public static void main(String[] args) {

        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2,16));

        float f1 = 45.378f;
        System.out.println(Math.round(f1));
        System.out.println(Math.ceil(f1));
        System.out.println(Math.floor(f1));

        double random = Math.random();
        System.out.println("random "+ random);

        double random2 = Math.random() * 100;
        System.out.println("random int " + (int)random2);

        int r = (int) (-50 + random2);
        System.out.println("r in range " + r);

        int min = -50;
        int max = 50;
        int r1 = (int)((random * (max - min)) + min);
        System.out.println("r1 in range " + r1);


        int a = (int)((random * (max - min)) + min);
        System.out.println("a " + a);

        int b = (int)((random * (200 - (-200))) + (-200));
        System.out.println("b " + b);

        double c = Math.random() * 100;
        System.out.println("c " + (int)c);

        double result = Math.abs(a+b)/Math.pow((a-b),3) - Math.sqrt(c);
        System.out.println("result " + result);



    }
}
