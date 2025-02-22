package com.hillel.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhile {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        int i = 0;
        do {
            System.out.println(i);
            i++;
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);

        } while (i <= 10);



        int j =  10;
        String stop = "n";
        do {
            System.out.println( j + " seconds left until the bomb explodes.");
            Thread.sleep(1000);
            j--;
            if (j == 5) {
                System.out.println("Do you want to stop bomb? y/n: ");
                stop = READER.readLine();
            }
            if (stop.equals("y")) {
                System.out.println("You stopped bomb.");
                break;
            }


        } while (j >= 0);
        if (stop.equals("n")) {

            System.out.println("BOOM!");
        }

    }
}
