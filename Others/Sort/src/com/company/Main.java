package com.company;

import java.util.Scanner;

public class Main {


    public static void showElements(int[] repos, int count) {
        if (count == 0) {
            System.out.println("Пустое хранилище!");
        } else {
            for (int i = 0; i < count; i++)
                System.out.print(repos[i] + " ");
        }
    }

    public static int addToStart(int[] arr, int count, int number) {
        if (count >= 100) {
            System.out.println("Хранилище полное!");
        } else {
            for (int i = count; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = number;
            count++;
        }
        return count;
    }

    public static int addToEnd(int[] arr, int count, int number) {
        if (count >= 100) {
            System.out.println("Хранилище полное!");
        } else {
            arr[count] = number;
            count++;
        }
        return count;
    }

    public static int deleteElem(int[] arr, int count, int input) {
        System.out.println("Элемент какой позиции Вы хотите удалить?");
        if (count > 0) {

            for (int i = input; i < count; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        } else {
            System.out.println("Массив пустой.");
        }
        return count;
    }

    public static void sortRepos(int[] repos, int count) {
        for (int i = 1; i < count; i++) {
            for (int n = 0; n < count - i; n++) {
                if (repos[n] > repos[n + 1]) {
                    swap(repos, n);
                }
            }
        }
    }

    private static void swap(int[] repos, int n) {
        int temp = repos[n];
        repos[n] = repos[n + 1];
        repos[n + 1] = temp;
    }

    public static void main(String[] args) {

        int command, count = 7;
        int repos[] = new int[100];
        for (int i = 0; i < 7; i++) {
            repos[i] = - i;
        }

        System.out.println("1. Показать массив - выводит только count-элементов");
        System.out.println("2. Добавить в начало");
        System.out.println("3. Добавить в конец");
        System.out.println("4. Удалить по позиции");
        System.out.println("5. Сортировать массив");
        System.out.println("6. Выход");

        Scanner scn = new Scanner(System.in);


        while (true) {
            command = scn.nextInt();
            switch (command) {
                case 1:
                    showElements(repos, count);
                    System.out.println();
                    break;
                case 2:
                    count = addToStart(repos, count, scn.nextInt());
                    break;
                case 3:
                    count = addToEnd(repos, count, scn.nextInt());
                    break;
                case 4:
                    count = deleteElem(repos, count, scn.nextInt());
                    break;
                case 5:
                    sortRepos(repos, count);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Комманда не верна, братишь");
                    break;
            }

        }

    }

}