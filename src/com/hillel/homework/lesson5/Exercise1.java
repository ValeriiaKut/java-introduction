package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a first mark: ");
        int mark = Integer.parseInt(reader.readLine());

        System.out.println("Enter a second mark: ");
        int mark2 = Integer.parseInt(reader.readLine());

        System.out.println("Enter a third mark: ");
        int mark3 = Integer.parseInt(reader.readLine());

        System.out.println("Enter a fourth mark: ");
        int mark4 = Integer.parseInt(reader.readLine());

        System.out.println("Enter a fifth mark: ");
        int mark5 = Integer.parseInt(reader.readLine());

        int finishMark = arithmeticMeanOfGrades(mark, mark2, mark3, mark4, mark5);

        if (finishMark < 8) {
            System.out.println("you won't get a scholarship");
        }
        else if (finishMark >= 8 && finishMark < 10) {
            System.out.println("you'll get a regular scholarship");

        }
        else  {
            System.out.println("you'll get an increased scholarship");
        }




    }
    private static int arithmeticMeanOfGrades(
            int mark, int mark2, int mark3,
            int mark4, int mark5
    ) {
        return (mark + mark2 + mark3 + mark4 + mark5) / 5;
    };

}
