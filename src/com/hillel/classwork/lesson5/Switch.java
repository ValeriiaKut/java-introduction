package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");

        String string = reader.readLine();

        int number = Integer.parseInt(string);
        System.out.println("The number is: " + number);


        printMonths(number);
        printSeason(number);
    }

    private static void printMonths(int number) {
        int a;
        switch (number){
            case 1:
                System.out.println("JANUARY");
                a = 2;
                System.out.println(a);
                break;
                case 2:
                    System.out.println("FEBRUARY");
                    break;
                    case 3:
                        System.out.println("MARCH");
                        break;
                        case 4:
                            System.out.println("APRIL");
                            break;
                            case 5:
                                System.out.println("MAY");
                                break;
                                case 6:
                                    System.out.println("JUNE");
                                    break;
                                    case 7:
                                        System.out.println("JULY");
                                        break;
                                        case 8:
                                            System.out.println("AUGUST");
                                            break;
                                            case 9:
                                                System.out.println("SEPTEMBER");
                                                break;
                                                case 10:
                                                    System.out.println("OCTOBER");
                                                    break;
                                                    case 11:
                                                        System.out.println("NOVEMBER");
                                                        break;
                                                        case 12:
                                                            System.out.println("DECEMBER");
                                                            break;
                                                            default:
                                                                System.out.println("Invalid number");
        }

    }
    private static void printSeason(int number) {
        switch (number){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
            default:
                System.out.println("Invalid number");
        }

    }
}
