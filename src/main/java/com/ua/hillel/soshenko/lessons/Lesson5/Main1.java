package com.ua.hillel.soshenko.lessons.Lesson5;

public class Main1 {
    public static void main(String[] args) {
        String teamName1 = "Hello Java";
        int team1Player1 = 1;
        int team1Player2 = 3;
        int team1Player3 = 5;
        int team1Player4 = 7;
        int team1Player5 = 9;
        int  sum1 = team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5;
        int result1 = sum1 /5;

        String teamName2 = "Hello Git";
        int team2Player1 = 2;
        int team2Player2 = 4;
        int team2Player3 = 6;
        int team2Player4 = 8;
        int team2Player5 = 10;
        int  sum2 = team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5;
        int result2 = sum2 /5;

        if (result1 > result2)
        System.out.println("Перемогла команда " + teamName1 + " отримала " + result1 + " очків");
         else {
            System.out.println("Перемогла команда " + teamName2 + " набрала " + result2 + " очків");
        }

    }
}
