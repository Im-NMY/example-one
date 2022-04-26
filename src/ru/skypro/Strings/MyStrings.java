package ru.skypro.Strings;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Arrays;

public class MyStrings {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Строки:");
        System.out.println();

//задача №1,2,3,4:
        System.out.println("Задача №1 --------------------------------------------------");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФиО сотрудника - " + fullName);

        System.out.println("Задача №2 --------------------------------------------------");
        System.out.println("Данные ФиО сотрудника для заполнения отчета — "+fullName.toUpperCase());

//        System.out.println();
//        String q = fullName;
//        String q1 = q.toUpperCase();
//        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+q1);

        System.out.println("Задача №3 --------------------------------------------------");
        System.out.println("Данные ФиО сотрудника для административного отдела — " + fullName.replace(' ', ';'));

//        System.out.println();
//        String q2 = q.replace(' ',';');
//        System.out.println("Данные ФИО сотрудника для административного отдела — "+q2);

        System.out.println("Задача №4 --------------------------------------------------");
        String rusFullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФиО сотрудника — " +rusFullName.replace("ё", "е"));

//        rusFullName = rusFullName.replace("ё", "е");
//        System.out.println("Данные ФиО сотрудника — " + rusFullName);
        System.out.println("------------------------------------------------------------");
        System.out.println("End.");
    }
}
