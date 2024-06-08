package org.example;

import java.util.Scanner;

public class Task_1_Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFromOneToTwelve;
        do {
            System.out.print("Введите любое число от 1 до 12: ");
            numberFromOneToTwelve = scanner.nextInt();
            if (0 < numberFromOneToTwelve & numberFromOneToTwelve > 12) {
                System.out.println("Не верно введено число , введите снова");
            } else {
                switch (numberFromOneToTwelve) {
                    case 1 -> System.out.println("Январь");
                    case 2 -> System.out.println("Февраль");
                    case 3 -> System.out.println("Март");
                    case 4 -> System.out.println("Апрель");
                    case 5 -> System.out.println("Май");
                    case 6 -> System.out.println("Июнь");
                    case 7 -> System.out.println("Июль");
                    case 8 -> System.out.println("Август");
                    case 9 -> System.out.println("Сентябрь");
                    case 10 -> System.out.println("Октябрь");
                    case 11 -> System.out.println("Ноябрь");
                    case 12 -> System.out.println("Декабрь");
                    default -> System.out.println("Такого месяца не существует");
                }
            }

        } while (0 < numberFromOneToTwelve & numberFromOneToTwelve > 12);

    }
}