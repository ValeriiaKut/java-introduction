package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Type a  string : ");
        String string = READER.readLine().toLowerCase().replaceAll("\\s+", "");

        char[] array = string.toCharArray();

        for (char c : array) {
            System.out.println(c);
        }


        int i = 0;
        int j = array.length - 1;
        boolean isPalindrome = true;


        while (i < j) {
            if (array[i] != array[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }



    }
}
