package com.ua.hillel.soshenko.lessons.lesson6.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        while (count < 100) {
            int number = random.nextInt(900) + 100;

            String str = Integer.toString(number);

            if (str.contains("4") || str.contains("9")) {
                continue;
            }
            System.out.println("Номер шатла " + number);
            count++;


        }
        System.out.println("Кількість = " + count);

    }

}

