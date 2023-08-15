package org.example;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер билета");
        int numberTicket = scanner.nextInt();

        calculation(numberTicket);
    }

    public static void calculation(int numeric) {
       int number6 = numeric % 10;
       int number5 = (numeric/10)%10;
       int number4 = (numeric/100)%10;
       int number3 = (numeric/1000)%10;
       int number2 = (numeric/10000)%10;
       int number1 = (numeric/100000)%10;
       int result1 = number4 + number5 + number6;
       int result2 = number1 + number2 + number3;
        if (result1 == result2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

