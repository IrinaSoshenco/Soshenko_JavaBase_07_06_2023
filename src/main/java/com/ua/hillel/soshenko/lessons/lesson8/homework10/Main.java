package com.ua.hillel.soshenko.lessons.lesson8.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] firstArray= new int[7];
        int [] secondArray= new int[7];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 11);
        }
        System.out.println("Числа, які загадані фірмою-організатором лотереї");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Числа, які вгадав гравець");
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Сортування за зростанням");
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        int numberCoincidences = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                numberCoincidences++;
            }
        }
        System.out.println("Кількість збігів: " + numberCoincidences);

    }
}
