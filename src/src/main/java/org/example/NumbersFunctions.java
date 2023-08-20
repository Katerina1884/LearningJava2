package org.example;

import java.util.Scanner;

public class NumbersFunctions {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (checkNumber(number1, number2, number3)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static boolean checkNumber(int number1, int number2, int number3) {
        return number1 == number2 || number1 == number3 || number2 == number3;
    }
}
