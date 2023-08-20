package org.example;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер билета");
        int numberTicket = scanner.nextInt();

        if(calculation(numberTicket)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean calculation(int numberTicket) {
       int number6 = numberTicket % 10;
       int number5 = (numberTicket/10)%10;
       int number4 = (numberTicket/100)%10;
       int number3 = (numberTicket/1000)%10;
       int number2 = (numberTicket/10000)%10;
       int number1 = (numberTicket/100000)%10;
       int result1 = number4 + number5 + number6;
       int result2 = number1 + number2 + number3;
       return result1 == result2;
    }
}

