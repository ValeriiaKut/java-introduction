package com.hillel.classwork.lesson4;

public class Methods {

    public static void main(String[] args) {

        printMessage();
        printMessage();
        printMessage();

        int number = generateRandom();
        System.out.println(number);

        int random = generateRandom(18,50);
        System.out.println(random);

        printMessage("test");

    }

    public static void printMessage() {
         System.out.println("message");
    }

    public static void printMessage(String number) {
        System.out.println("message" + number);
    }

    public static int generateRandom(){
        return (int) (Math.random() * 100);

    }

    public static int generateRandom(int min, int max){
        printMessage();
        return (int) (Math.random()* (max - min) + min);
    }
}
