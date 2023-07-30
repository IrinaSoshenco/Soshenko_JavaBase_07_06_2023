package com.ua.hillel.soshenko.lessons.lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість рядків");
        int M = 1;
        if (scanner.hasNextInt()) {
            M = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);
        }
        System.out.println("Введіть кількість стовбців");
        int N = 2;
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);
        }
        int[][] result = new int[N][M];
        int[][] array = new int[M][N];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }


        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array[j][i];
            }
        }
        System.out.println();
        System.out.println("AFTER");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
