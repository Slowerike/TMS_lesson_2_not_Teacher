package org.example;

import java.util.Scanner;

public class Task_1_Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean result = number % 2 == 0;
        System.out.println(result);
    }
}
