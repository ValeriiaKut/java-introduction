package com.hillel.homework.lesson7;

public class RandomFinal {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + " seconds to BOOM!");
            Thread.sleep(1000);
            if (i == 0) {
                int random = (int) (Math.random() * 10);
                if (random > 5) {
                    System.out.println("The random number is " + random + ". You saved.");
                } else {
                    System.out.println("The random number is " + random + ". BOOM");
                }
            }
        }
    }
}
