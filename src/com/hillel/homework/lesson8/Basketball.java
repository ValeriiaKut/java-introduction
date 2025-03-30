package com.hillel.homework.lesson8;

import java.util.Arrays;

public class Basketball {
    public static void main(String[] args) {
        int[] team = new int[10];
        basketball(team);
        mainTeam(team);
    }

    public static void basketball(int[] team) {
        for (int i = 0; i < team.length; i++) {
            team[i] = randomPoint();
        }
        System.out.println(Arrays.toString(team));
    }

    public static void mainTeam(int[] team) {
        for (int i = 0; i < team.length ; i++) {
            if (i % 2 == 0 ) {
                int sum = 0;
                for (int j = 0; j < team.length; j++) {
                    if (j % 2 == 0) {  // Якщо індекс j парний
                        sum += team[j];
                    }
                }
                team[i] += sum;
                System.out.println(team[i]);
            }



        }
    }

    public static int randomPoint() {
        return (int) (Math.random() * 10);
    }
}
