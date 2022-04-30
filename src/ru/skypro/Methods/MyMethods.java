package ru.skypro.Methods;

public class MyMethods {
    public static int typeYear (int year){
    // метод к задаче № 1 :
        int typeYear = year;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) ;
            System.out.println(typeYear + " год является високосным!");
        } else {
            System.out.println(typeYear + " год не является високосным!");
        }
        return typeYear;
    }
    // метод к задаче № 2 :
    public static int typePhone(int yearPhone, int typeOS) {
        int clientOS = typeOS;
        if (clientOS == 0);
        if (clientOS == 1);
        int typeVersion = yearPhone;
        if (clientOS == 0 && typeVersion >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && typeVersion < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && typeVersion >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS== 1 && typeVersion < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return typeVersion;
    }
    // метод к задаче № 3 :
    public static int delivery (int distance){
        int delivery = distance;
        if (distance < 20) {
            System.out.println("Потребуется на доставку 1 дней.");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется на доставку 2 дня.");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется на доставку 3 дня.");
        }
        return delivery;
    }
    // метод к задаче № 4 :
    public static void  removeDuplicates(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("обнаружен дубль: " + str.charAt(i)+ " !");
                return;
            }
        }
        System.out.println("Дублей не обнаруженно!");
    }

    public static void main(String[] args) {
        printSeparator();
    // задача № 1 :
        // Что бы узнать тип года (високосный или нет), введить необходимы вам год в - (....)

                            typeYear(3845);

        printSeparator();
    // задача № 2 :
        // Что бы определить какую версию скачать, введить год выпуска вашего смартфона в - (....).
        // И введите (1) - это typeOS "Android"; (0) - это typeOS "iOS".

                            typePhone(2011, 0);

        printSeparator();
    // задача № 3 :
        // Что бы узнать срок доставки, введите дистанцию от 1 км до 100 км в - (....)
                            delivery(55);

        printSeparator();
    // задача № 4 :
        // Что бы проверить строку на наличее дублей, введите имя обекта в - (....)

        String text = "aabccddefgghiijjkk";
                            removeDuplicates(text);

        printSeparatorEnd();
    }
    public static void printSeparator() {
        System.out.println("-----------------------------------------\nЗадача :");
    }
    public static void printSeparatorEnd() {
        System.out.println("-----------------------------------------\nEnd.   ");
    }
}


