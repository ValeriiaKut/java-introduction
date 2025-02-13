package com.hillel.classwork.lesson4;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the box: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();

        int volume = calculateVolume(width, height, depth);
        System.out.println("Volume is " + volume);

        System.out.println("Volume is " + (calculateVolume(23,77,23)));


    }
    public static int calculateVolume(int width, int height, int depth) {
        return width * height * depth;
    }
}

