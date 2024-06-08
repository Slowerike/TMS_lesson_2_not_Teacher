package org.example;

import java.util.Scanner;

public class Task_2_Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temperature = scanner.nextInt();
        if (-5 < temperature) {
            System.out.println("Warm");
        } else if (-5 >= temperature & temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

    }
}

