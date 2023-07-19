package com.ua.hillel.soshenko.lessons.lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Будьласка, введіть назву першої команди");
        String teamName1 = scanner.nextLine();
        System.out.println("Назва першої команди " + teamName1);
        System.out.println("Будьласка, введіть назву другої команди");
        String teamName2 = scanner.nextLine();
        System.out.println("Назва першої команди " + teamName2);
// Перша
        System.out.println("Будьласка, введіть силу атаки гравця 1 з команди Hello Java");
        int team1Player1 = 1;
        if (scanner.hasNextInt()) {
            team1Player1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Будьласка, введіть силу атаки гравця 1 з команди Hello Git");
        int team2Player1 = 2;
        if (scanner.hasNextInt()) {
            team2Player1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

//Друга
        System.out.println("Будьласка, введіть силу атаки гравця 2 з команди Hello Java");
        int team1Player2 = 1;
        if (scanner.hasNextInt()) {
            team1Player2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println("Будьласка, введіть силу атаки гравця 2 з команди Hello Git");
        int team2Player2 = 2;
        if (scanner.hasNextInt()) {
            team2Player2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

//Третя
        System.out.println("Будьласка, введіть силу атаки гравця 3 з команди Hello Java");
        int team1Player3 = 1;
        if (scanner.hasNextInt()) {
            team1Player3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println("Будьласка, введіть силу атаки гравця 3 з команди Hello Git");
        int team2Player3 = 2;
        if (scanner.hasNextInt()) {
            team2Player3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

//Четверта
        System.out.println("Будьласка, введіть силу атаки гравця 4 з команди Hello Java");
        int team1Player4 = 1;
        if (scanner.hasNextInt()) {
            team1Player4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println("Будьласка, введіть силу атаки гравця 4 з команди Hello Git");
        int team2Player4 = 2;
        if (scanner.hasNextInt()) {
            team2Player4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

//Пʼята
        System.out.println("Будьласка, введіть силу атаки гравця 5 з команди Hello Java");
        int team1Player5 = 1;
        if (scanner.hasNextInt()) {
            team1Player5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println("Будьласка, введіть силу атаки гравця 5 з команди Hello Git");
        int team2Player5 = 2;
        if (scanner.hasNextInt()) {
            team2Player5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }



        int sum1 = team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5;
        double result1 = (double) sum1 / 5;


        int sum2 = team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5;
        double result2 = (double) sum2 / 5;
        System.out.println("Середня сила атаки гравців команди " + teamName1 + "=" + result1);
        System.out.println("Середня сила атаки гравців команди " + teamName2 + "=" + result2);

        if (sum1 > sum2) {
            System.out.println("Перемогла команда " + teamName1 + " отримала " + sum1 + " очків");
        }
        if (sum1 < sum2) {
            System.out.println("Перемогла команда " + teamName2 + " набрала " + sum2 + " очків");
        }
        else {
            System.out.println("Нічия");
        }
    }
}
