package com.hillel.classwork.lesson6;

public class StringText {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        String s3 = s2;
        String s4 = "Hello";

        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s4);

        System.out.println("Compare links:");
        System.out.println(s1 == s2);
        System.out.println("Compare values:");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println("Hello".equals(s3));


        boolean result = s1.equals(s3);
        if (!s1.equals(s3)) {
            System.out.println("not equal");

        }
    }
}
