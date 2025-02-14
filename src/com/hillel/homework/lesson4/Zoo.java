package com.hillel.homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number of bears: ");
        int bears = Integer.parseInt(reader.readLine());

        System.out.println("Enter a number of zebras: ");
        int zebras = Integer.parseInt(reader.readLine());

        System.out.println("Enter a number of elephants: ");
        int elephants = Integer.parseInt(reader.readLine());

        System.out.println("Enter a number of giraffes: ");
        int giraffes = Integer.parseInt(reader.readLine());

        int animals = calculateAnimals(bears, zebras, elephants, giraffes);

        int animalsNextYear = calculateAnimalsNextYear(bears,elephants,giraffes,zebras);

        System.out.println("Total number of animals now: " + animals);

        System.out.println("Number of animals next year: " + animalsNextYear);


        System.out.println("Enter a number of porcupine: ");
        int porcupine = Integer.parseInt(reader.readLine());

        System.out.println( "Total number of animals now (including porcupines):" + calculateAnimals(animals,porcupine));

        System.out.println( "Number of animals next year (including porcupines): " + calculateAnimalsNextYear(animalsNextYear, porcupine));



    }
    public static int calculateAnimals(
            int bears, int zebras,
            int elephants, int giraffes
    ) {
        return bears + zebras + elephants + giraffes;
    }

    public static int calculateAnimals(
            int animals, int porcupine
    ) {
        return animals + porcupine;
    }

    public static int calculateAnimalsNextYear(
            int bears, int elephants,
            int giraffes, int zebras
    ){
        return (int) ((bears * 1.3) + (zebras * 1.1) + (elephants * 1.15) + (giraffes * 1.5));
    }
    public static int calculateAnimalsNextYear(
           int animalsNextYear, int porcupine
    ){
        return (int) (animalsNextYear + (porcupine * 1.16));
    }
}
