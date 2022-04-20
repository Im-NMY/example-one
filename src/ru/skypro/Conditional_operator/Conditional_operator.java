package ru.skypro.Conditional_operator;

public class Conditional_operator {
    public static void main(String[] args) {
        System.out.println("Условный оператор");
//задача №1
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №1 :");
        System.out.println("  ");
        int clientOS = 1;      // : вводим версию ОС для смартфона (1 или 0) :
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке: ...");
        if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке: ...");
//задача №2
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №2 :");
        System.out.println("  ");
        int clientDeviceYear = 2013;      // : вводим год смартфона (до 2015 версии считаються устаревшими!) :
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
//задача №3
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №3 :");
        System.out.println("  ");
        int year = 2022;         // : вводим год для определения високосный или не високосный :
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) ;
            System.out.println(year + " год является високосным!");
        } else {
            if (year % 4 != 0) ;
            if (year % 100 == 0 || year % 400 != 0) ;
            System.out.println(year + " год не является високосным!");
        }
//задача №4
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №4 :");
        System.out.println("  ");
        int deliveryDistance = 95;    // : вводим дистанцию до клиента  :
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: (1) one day");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: (2) two days");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: (3) three days");
        }
//задача №5
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №5 :");
        System.out.println("  ");
        int monthNumber;
        monthNumber = 12; // : вводим число месяца года ( от 1  :
        switch (monthNumber){
            case 12,1,2:
                System.out.println("Зима (winter)");
                break;
            case 3,4,5:
                System.out.println("Весна (Spring)");
                break;
            case 6,7,8:
                System.out.println("Лето (summer)");
                break;
            case 9,10,11:
                System.out.println("Осень (autumn)");
                break;
            default:
                System.out.println("Неверно введен месяц (entered month incorrectly)");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("End.");
        System.out.println("  ");
    }
}
