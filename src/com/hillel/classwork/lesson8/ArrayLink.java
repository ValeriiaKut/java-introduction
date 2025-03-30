package com.hillel.classwork.lesson8;

public class ArrayLink {
    public static void main(String[] args) {


        String[] strings = new String[3];

        fillArray(strings);
        printArray(strings);
        System.out.println("strings link " + strings);
        String[] strings2 = strings;
        System.out.println("strings2 link " + strings2);

        strings2[0] = "new text";
        System.out.println(strings[0]);
        System.out.println(strings2[0]);

        String[] newStrings = createAndFill(10);
        printArray(newStrings);


    }

    private static void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = i + "str";
        }
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] createAndFill(int size){
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }


}
