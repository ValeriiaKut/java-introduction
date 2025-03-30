package com.hillel.homework.lesson8;


public class Ex1 {


    public static void main(String[] args) throws InterruptedException {

        int[] team1 = new int[11];
        int[] team2 = new int[11];

        System.out.println("Age of team 1: ");
        ageOfTeam(team1);

        System.out.println("Age of team 2: ");
        ageOfTeam(team2);

        System.out.println("Counting several age of team 1  ... ");
        double severalAge1 = severalAge(team1);


        System.out.println("Counting several age of team 2  ... ");
        double severalAge2 = severalAge(team2);

        whoIsOlder(severalAge1, severalAge2);


    }

    private static void whoIsOlder(double severalAge1, double severalAge2) {
        if (severalAge1 > severalAge2) {
            System.out.println("Team 1 is greater than Team 2");
        } else if (severalAge1 == severalAge2) {
            System.out.println("Team 1 and Team 2 are the same");
        } else {
            System.out.println("Team 2 is greater than Team 1");
        }
    }

    public static void ageOfTeam(int[] team) {
        for (int i = 0; i < team.length; i++) {
            team[i] = randomAge();
            if (i == team.length - 1) {
                System.out.print(team[i] + ".");
            } else {
                System.out.print(team[i] + ", ");
            }
        }
        System.out.println();
    }


    public static int randomAge() {
        int max = 45;
        int min = 18;
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static double severalAge(int[] team) throws InterruptedException {
        for (int i = 0; i < team.length; i++) {
            Thread.sleep(1000);
            if (i > 0) {
                team[i] = team[i - 1] + team[i];
                System.out.print(team[i] + "...");
            } else {
                System.out.print(team[i] + "...");
            }
        }
        double age = (double) team[team.length - 1] / 11;
        System.out.println();
        System.out.println("The several age is: " + age);
        return age;
    }


}
