package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        String string = reader.readLine();
        int number = Integer.parseInt(string);
        System.out.println("The number is: " + number);

        if (number  > 50 && number < 100 ) {
            System.out.println("11 < number < 100");
        }
        else if (number > 1 && number < 51) {
            System.out.println("1 < number < 51");
        }
        else  {
            System.out.println("The number is < 0");
        }
        if (number == 100) {
            System.out.println("The number is 100");
        }

    }
}
