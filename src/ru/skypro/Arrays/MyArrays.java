package ru.skypro.Arrays;
import java.util.Arrays;
public class MyArrays {
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Массивы: ");
//задача №1
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №1 :");
        System.out.println("  ");
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей.");
//задача №2
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №2 :");
        System.out.println("  ");
        int maxCoin = 100_000;
        int minCoin = 200_000;
        for (int j : arr) {
            if (j > maxCoin) {
                maxCoin = j;
            }
            if (j < minCoin) {
                minCoin = j;
            }

        }
        System.out.println();
        System.out.println("Минимальная сумма трат за день составила "+maxCoin+" рублей.");
        System.out.println("Максимальная сумма трат за день составила "+minCoin+" рублей.");
//задача №3
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №3 :");
        System.out.println("  ");
        int daysMonth = 30;
        var mean = sum / daysMonth;
        System.out.println("Средняя сумма трат за месяц составила "+mean+" рублей.");
//задача №4
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №4 :");
        System.out.println("  ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.printf(Arrays.toString(reverseFullName));
        int size = reverseFullName.length;
        for (int i = 0; i < size / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[size - 1 - i];
            reverseFullName[size - 1 - i] = temp;
        }
        System.out.println(" ");
        System.out.printf(Arrays.toString(reverseFullName));
        System.out.println(" ");
        System.out.println("Баг программы исправлен! ");
        System.out.println("--------------------------------------------------");
        System.out.println("End.");
        System.out.println("  ");
    }
}


