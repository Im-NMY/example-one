package ru.skypro.Conditional_operator;

public class Conditional_operator {
    public static void main(String[] args) {
        System.out.println("�������� ��������");
//������ �1
        System.out.println("--------------------------------------------------");
        System.out.println("������ �1 :");
        System.out.println("  ");
        int clientOS = 1;      // : ������ ������ �� ��� ��������� (1 ��� 0) :
        if (clientOS == 0)
            System.out.println("���������� ������ ���������� ��� iOS �� ������: ...");
        if (clientOS == 1)
            System.out.println("���������� ������ ���������� ��� Android �� ������: ...");
//������ �2
        System.out.println("--------------------------------------------------");
        System.out.println("������ �2 :");
        System.out.println("  ");
        int clientDeviceYear = 2013;      // : ������ ��� ��������� (�� 2015 ������ ���������� �����������!) :
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }
//������ �3
        System.out.println("--------------------------------------------------");
        System.out.println("������ �3 :");
        System.out.println("  ");
        int year = 2022;         // : ������ ��� ��� ����������� ���������� ��� �� ���������� :
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) ;
            System.out.println(year + " ��� �������� ����������!");
        } else {
            if (year % 4 != 0) ;
            if (year % 100 == 0 || year % 400 != 0) ;
            System.out.println(year + " ��� �� �������� ����������!");
        }
//������ �4
        System.out.println("--------------------------------------------------");
        System.out.println("������ �4 :");
        System.out.println("  ");
        int deliveryDistance = 95;    // : ������ ��������� �� �������  :
        if (deliveryDistance < 20) {
            System.out.println("����������� ����: (1) one day");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("����������� ����: (2) two days");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("����������� ����: (3) three days");
        }
//������ �5
        System.out.println("--------------------------------------------------");
        System.out.println("������ �5 :");
        System.out.println("  ");
        int monthNumber;
        monthNumber = 12; // : ������ ����� ������ ���� ( �� 1  :
        switch (monthNumber){
            case 12,1,2:
                System.out.println("���� (winter)");
                break;
            case 3,4,5:
                System.out.println("����� (Spring)");
                break;
            case 6,7,8:
                System.out.println("���� (summer)");
                break;
            case 9,10,11:
                System.out.println("����� (autumn)");
                break;
            default:
                System.out.println("������� ������ ����� (entered month incorrectly)");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("End.");
        System.out.println("  ");
    }
}
