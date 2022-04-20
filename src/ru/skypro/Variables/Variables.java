package ru.skypro.Variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Переменные");
//задача №1
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №1 - Типы переменных:");
        System.out.println("  ");
//Целочисленные:
        byte dataTypeOne = 127;
        short dataTypTwo = 32767;
        int dataTypThree = 2147483647;
        long dataTypFour = 9223372036854775807L;
//С плавающей точкой:
        float dataTypFive = 3.4f;
        double dataTypSix = 1.7;
//Символы:
        char dataTypSeven = 0;
//Логические:
        boolean dataTypEight = true || false;
        System.out.println("Целочисленные: byte; short; int; long.");
        System.out.println("С плавающей точкой: float; double.");
        System.out.println("Символы: char.");
        System.out.println("Логические: boolean.");
//задача №2
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №2 :");
        System.out.println("  ");
        var boxerWeightOne = 78.2;      // вес боксера 1
        var boxerWeightTwo = 82.7;      // вес боксера 2
        var massOfBoxers = boxerWeightOne + boxerWeightTwo;
        System.out.println(massOfBoxers + " кг - общий вес боксеров");
        var boxerDifference = boxerWeightTwo - boxerWeightOne;
        System.out.println(boxerDifference + " кг - разница веса боксеров");
//задача №3
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №3 :");
        System.out.println("  ");
        var bananas =5;
        var massOfBananas = bananas * 80;
        var milk = 200;
        var massOfMilk = milk * 1.05;
        var iceCream = 2;
        var massOfIceCream = iceCream * 100;
        var agg = 4;
        var massOfAggs = agg * 70;
        var massOfCocktailGram = massOfAggs + massOfBananas + massOfIceCream + massOfMilk;
        System.out.println("Масса завтрака для спортсмена " + massOfCocktailGram + " грамм.");
        var massOfCocktailKilogram = massOfCocktailGram / 1000;
        System.out.println("Масса завтра для спортсмена " + massOfCocktailKilogram + " Кг.");
//задача №4
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №4 :");
        System.out.println("  ");
        var weightLossKilogram = 7;
        var weightLossGram = weightLossKilogram * 1000;
        var dietOne = 250;
        var daysDietOne = weightLossGram / dietOne;
        System.out.println("Потребуется дней " + daysDietOne + " потребуется дней для похудения первым способом");
        var dietTwo = 500;
        var daysDietTwo = weightLossGram / dietTwo;
        System.out.println("потребуется дней " + daysDietTwo + " для похудения вторым способом");
//задача №5
        System.out.println("--------------------------------------------------");
        System.out.println("Задача №5 :");
        System.out.println("  ");
//Masha:
        var masha = 67760;
        var percentMasha = (masha*10)/100;
        var salaryIncreaseMasha = masha + percentMasha;
        var differenceMasha = percentMasha * 12;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("  ");
//Denis
        var Denis = 83690;
        var percentDenis = (Denis*10)/100;
        var salaryIncreaseDenis = Denis + percentDenis;
        var differenceDenis = percentDenis * 12;
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("  ");
//Kristina
        var Kristina = 76230;
        var percentKristina = (Kristina*10)/100;
        var salaryIncreaseKristina = Kristina + percentKristina;
        var differenceKristina = percentKristina * 12;
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
        System.out.println("--------------------------------------------------");
        System.out.println(" End. ");
    }
}
