package org.example;

import java.util.Scanner;

public class BodyMassIndex {

    public static double BMI(double weight, double height) {
        double index = weight / Math.pow(height, 2);
        return index;
    }

    public static void printBMI(double BMI) {
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal weight");
        }
        else if(BMI >= 25 && BMI <30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesity");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес в кг");
        double weight = scanner.nextDouble();

        System.out.println("Введите рост в метрах");
        double height = scanner.nextDouble();

        printBMI(BMI(weight, height));
    }
}
