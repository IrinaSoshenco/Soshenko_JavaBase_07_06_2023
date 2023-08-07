package com.ua.hillel.soshenko.lessons.lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компʼютер загадав число від 0 до 10. У вас є 3 спроби для того щоб вгадати. ");
        int att = 3;
        for (int i = 0; i < att; i++) {
            System.out.println("Спроба " + (i + 1));
            int userNumber = 1;
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber == secretNumber) {
                    System.out.println("Ви перемогли!!!");
                    break;}
                else{
                        System.out.println("Спробуйте знову");
                    }
                }

            else {
                System.out.println("Wrong data");
                System.exit(0);

            }


        }
        System.out.println("Гру завершено. Компʼютер загадав: " + secretNumber);

    }
}
