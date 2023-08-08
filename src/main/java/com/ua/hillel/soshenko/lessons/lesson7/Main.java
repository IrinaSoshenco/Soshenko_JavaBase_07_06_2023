package com.ua.hillel.soshenko.lessons.lesson7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamSize = 25;
        int ageMin = 18;
        int ageMax = 40;

        int[] team1 = new int[teamSize];
        int[] team2 = new int[teamSize];
        Random random = new Random();
        for (int i = 0; i < team1.length; i ++) {
            team1[i] = 18 + random.nextInt(23);
        }
        System.out.println("Вік гравців першої команди " + Arrays.toString(team1));
        for (int i = 0; i < team2.length; i ++) {
            team2[i] = 18 + random.nextInt(23);
        }
        System.out.println("Вік гравців другої команди " + Arrays.toString(team2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < teamSize; i++) {
            average1 += team1[i];
            average2 += team2[i];
        }
        average1/=teamSize;
        average2/=teamSize;
        System.out.println("Середній вік гравців першоі команди " + average1 + " Середній вік гравців першоі команди  " + average2);
    }
}
