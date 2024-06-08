package org.example;

public class Task_4_Home {
    public static void main(String[] args) {
        int counter = 1;
        while (counter < 100) {
            if (counter % 7 == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
