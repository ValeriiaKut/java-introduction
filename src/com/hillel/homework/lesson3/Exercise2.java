package com.hillel.homework.lesson3;

public class Exercise2 {
    public static void main(String[] args) {

        int a = (int)((Math.random() * (300 - (-10))) + (-10));
        System.out.println("a : " + a);

        int b = (int)((Math.random() * (20 - (-400))) + (-400));

        System.out.println("b : " + b);

        double c = Math.random() * 100;
        System.out.println("c : " + (int)c);

        double result = Math.abs(a-b)/Math.pow((a+b),3) - Math.sqrt(c);
        System.out.println("result : " + result);
    }
}
