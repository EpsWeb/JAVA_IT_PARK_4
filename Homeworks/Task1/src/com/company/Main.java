package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, sum, min, mul;


        System.out.println("МЕНЮ:");
        System.out.println("1. Считать сумму");
        System.out.println("2. Считать разность");
        System.out.println("3. Считать произведение");
        System.out.println("4. Выход");

        System.out.println("Введите первое число");
        a = scanner.nextInt();

        System.out.println("Введите второе число");
        b = scanner.nextInt();
        sum = a + b;
        min = a - b;
        mul = a * b;
        while (true) {
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Сумма равна " + sum);
                    System.out.println("Введите опять первое число");
                    a = scanner.nextInt();
                    System.out.println("Введите опять второе число");
                    b = scanner.nextInt();
                    sum = a + b;
                    break;
                case 2:
                    System.out.println("Разность равна " + min);
                    System.out.println("Введите опять первое число");
                    a = scanner.nextInt();
                    System.out.println("Введите опять второе число");
                    b = scanner.nextInt();
                    min = a - b;
                    break;
                case 3:
                    System.out.println("Произведение равно " + mul);
                    System.out.println("Введите опять первое число");
                    a = scanner.nextInt();
                    System.out.println("Введите опять второе число");
                    b = scanner.nextInt();
                    mul = a * b;
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
            }
        }
    }
}
