package com.hillel.homework.lesson2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Before change:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; // 10 + 20 = 30
        b = a - b; // 30 - 10 = 20
        a = a - b; // 30 - 20 = 10

        System.out.println("After change:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();

    }
}
