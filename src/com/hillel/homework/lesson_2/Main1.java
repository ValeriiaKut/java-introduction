package com.hillel.homework.lesson_2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення для a: ");
        int a = scanner.nextInt();
        
        System.out.print("Введіть значення для b: ");
        int b = scanner.nextInt();

        System.out.println("До зміни:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; // 10 + 20 = 30
        b = a - b; // 30 - 10 = 20
        a = a - b; // 30 - 20 = 10

        System.out.println("Після зміни:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();

    }
}
