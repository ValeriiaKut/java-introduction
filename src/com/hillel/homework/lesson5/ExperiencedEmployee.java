package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExperiencedEmployee {

    public static void main(String[] args) throws IOException {

        int monthsInYear = 12;
        int experienceBonus = 100;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your month salary : ");
        int monthSalary = Integer.parseInt(br.readLine());

        System.out.print("Enter your experience years : ");
        float experience = Float.parseFloat(br.readLine());


        if (experience > 5 && experience < 10){
            System.out.println("your experience gives you $100 in annual pay. " +
                    "Your year salary is: " + (yearSalary(monthSalary, monthsInYear) + experienceBonus));
        }

        else if (experience >= 10){
            System.out.println("your experience gives you $500 in annual pay. " +
                    "Your year salary is: " + (yearSalary(monthSalary, monthsInYear) + experienceBonus * 5));
        }

        else{
            System.out.println( "Your year salary is: " + yearSalary(monthSalary, monthsInYear));
        }
    }

    private static int yearSalary (int monthSalary, int monthsInYear){
        return monthSalary * monthsInYear;
    }
}
