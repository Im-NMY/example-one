package ru.skypro.Variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("����������");
//������ �1
        System.out.println("--------------------------------------------------");
        System.out.println("������ �1 - ���� ����������:");
        System.out.println("  ");
//�������������:
        byte dataTypeOne = 127;
        short dataTypTwo = 32767;
        int dataTypThree = 2147483647;
        long dataTypFour = 9223372036854775807L;
//� ��������� ������:
        float dataTypFive = 3.4f;
        double dataTypSix = 1.7;
//�������:
        char dataTypSeven = 0;
//����������:
        boolean dataTypEight = true || false;
        System.out.println("�������������: byte; short; int; long.");
        System.out.println("� ��������� ������: float; double.");
        System.out.println("�������: char.");
        System.out.println("����������: boolean.");
//������ �2
        System.out.println("--------------------------------------------------");
        System.out.println("������ �2 :");
        System.out.println("  ");
        var boxerWeightOne = 78.2;      // ��� ������� 1
        var boxerWeightTwo = 82.7;      // ��� ������� 2
        var massOfBoxers = boxerWeightOne + boxerWeightTwo;
        System.out.println(massOfBoxers + " �� - ����� ��� ��������");
        var boxerDifference = boxerWeightTwo - boxerWeightOne;
        System.out.println(boxerDifference + " �� - ������� ���� ��������");
//������ �3
        System.out.println("--------------------------------------------------");
        System.out.println("������ �3 :");
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
        System.out.println("����� �������� ��� ���������� " + massOfCocktailGram + " �����.");
        var massOfCocktailKilogram = massOfCocktailGram / 1000;
        System.out.println("����� ������ ��� ���������� " + massOfCocktailKilogram + " ��.");
//������ �4
        System.out.println("--------------------------------------------------");
        System.out.println("������ �4 :");
        System.out.println("  ");
        var weightLossKilogram = 7;
        var weightLossGram = weightLossKilogram * 1000;
        var dietOne = 250;
        var daysDietOne = weightLossGram / dietOne;
        System.out.println("����������� ���� " + daysDietOne + " ����������� ���� ��� ��������� ������ ��������");
        var dietTwo = 500;
        var daysDietTwo = weightLossGram / dietTwo;
        System.out.println("����������� ���� " + daysDietTwo + " ��� ��������� ������ ��������");
//������ �5
        System.out.println("--------------------------------------------------");
        System.out.println("������ �5 :");
        System.out.println("  ");
//Masha:
        var masha = 67760;
        var percentMasha = (masha*10)/100;
        var salaryIncreaseMasha = masha + percentMasha;
        var differenceMasha = percentMasha * 12;
        System.out.println("���� ������ �������� " + salaryIncreaseMasha + " ������. ������� ����� ����� �� " + differenceMasha + " ������.");
        System.out.println("  ");
//Denis
        var Denis = 83690;
        var percentDenis = (Denis*10)/100;
        var salaryIncreaseDenis = Denis + percentDenis;
        var differenceDenis = percentDenis * 12;
        System.out.println("����� ������ �������� " + salaryIncreaseDenis + " ������. ������� ����� ����� �� " + differenceDenis + " ������.");
        System.out.println("  ");
//Kristina
        var Kristina = 76230;
        var percentKristina = (Kristina*10)/100;
        var salaryIncreaseKristina = Kristina + percentKristina;
        var differenceKristina = percentKristina * 12;
        System.out.println("�������� ������ �������� " + salaryIncreaseKristina + " ������. ������� ����� ����� �� " + differenceKristina + " ������.");
        System.out.println("--------------------------------------------------");
        System.out.println(" End. ");
    }
}
