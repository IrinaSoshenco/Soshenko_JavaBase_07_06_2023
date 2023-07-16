package com.ua.hillel.soshenko.lessons.Lesson4;

public class Main2 {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;

        int totalLi = 860;

        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        int totalMin = (int) (totalLi * 1.5);

        int generalAttackLi = (warriorLi + archerLi + riderLi) * totalLi;
        int generalAttackMin = (warriorMin + archerMin + riderMin) * totalMin;
        System.out.println("Загальна атака армії Li = " + generalAttackLi + "" + "." + " " + "Загальна атака армії Min = " + generalAttackMin);



    }
}
