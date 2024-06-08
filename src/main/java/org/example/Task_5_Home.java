package org.example;

import java.util.Scanner;

public class Task_5_Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int start = 1;
        int counter = 0;
        int result = 0;
        do {
            System.out.print("Введеите любое положительное число: ");
            number = scanner.nextInt();
            if (number < 1 | number == 0) {
                System.out.println("Число отрицательное");
            } else {
                while (counter != number) {
                    result += counter + start;
                    counter++;
                }
                System.out.print(result + " ");
            }

        }
        while (number < 1 | number == 0);
    }
}
