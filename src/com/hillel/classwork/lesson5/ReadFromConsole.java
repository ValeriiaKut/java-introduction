package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        System.out.println("AS STRING: " + string);

        double d = Double.parseDouble(string);
        System.out.println("AS DOUBLE: " + d);

        int i = Integer.parseInt(string);
        System.out.println("AS INT: " + i);




    }
}
