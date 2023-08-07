package com.ua.hillel.soshenko.lessons.lesson6.homework8;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; counter < 100; i++) {
                boolean ok = true;
                int number = i;
                while (number > 0) {
                    int result = number % 10;
                    if (result == 4 || result == 9) {
                        ok = false;
                        break;
                    }
                    number = number / 10;
                }
                if (ok) {
                    System.out.println("shuttle number: " + i);
                    counter++;
                }
            }
            System.out.println("counter = " + counter);

        }
    }

