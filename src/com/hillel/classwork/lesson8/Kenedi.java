package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kenedi {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the amount of people: ");
        int[] people = new int[Integer.parseInt(READER.readLine())];

        Probability(people);
        Statistics(people);

        Murder(people);

    }

    private static void Murder(int[] people) {

        int maxIndex = 0;
        int maxValue = people[0];

        for (int i = 1; i < people.length; i++) {
            if (people[i] > maxValue) {
                maxValue = people[i];
                maxIndex = i;
            }
        }

        System.out.println("The murder is .... " + maxIndex + " he has probability: " + maxValue);
    }

    private static void Probability(int[] people) throws IOException {
        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter the " + i + "th number: ");
            people[i] = Integer.parseInt(READER.readLine());
            System.out.println(i + " index: " + people[i]);
        }
    }

    public static void Statistics(int[] people) {
        System.out.println("Statistics:");
        for (int i = 0; i < people.length; i++) {
            System.out.println(i + " element: " + people[i]);
        }
    }


}
