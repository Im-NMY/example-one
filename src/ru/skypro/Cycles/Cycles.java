package ru.skypro.Cycles;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Циклы: ");
//задача №1
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №1 :");
        System.out.println("  ");
        int q = 0;
        while (q < 10) {
            q++;
            System.out.print(q + " ");
        }
        System.out.println("  ");
        for (int s = 10; s > 0; s = s - 1) {
            System.out.print(s + " ");
        }
        System.out.println("  ");

//задача №2
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №2 :");
        System.out.println("  ");
        int friday = 7;
        for (int day = friday; day <= 31;day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

//задача №3
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №3 :");
        System.out.println("  ");
        int thisYear = 2021;
        int pastYears = thisYear - 200;
        int futureYears = thisYear + 100;
        int startWorld = 0;
        while (true) {
            startWorld = startWorld + 79;
            if (startWorld < pastYears) {
                continue;
            }
            if (startWorld > futureYears) {
                break;
            }
            System.out.println(startWorld + " год летят кометы!  ");
        }
        System.out.println("--------------------------------------------------");
        System.out.println(" End. ");
    }
}

