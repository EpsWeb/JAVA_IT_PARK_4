package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        1) Добавить в конец:
//        Пользователь вводит число, вы это число добавляете в первый пустой элемент массива и увеличиваете count на 1.
//                [ ] [ ] [ ]
//>> 2
//                [2] [ ] [ ]
//>> 4
//                [2] [4] [ ]
//        2) Добавить в начало
//                [2] [4] [ ]
//>> 3
//                [3] [2] [4]
//        3) Удаление по номеру - пользователь вводит номер, вы смещаете все элементы, начиная со след. после текущего номера на 1 влево
//                [3] [2] [4]
//                >> 0
//                [2] [4] [0], уменшить count!

        System.out.println("1. Показать массив - выводит только count-элементов");
        System.out.println("2. Добавить в начало");
        System.out.println("3. Добавить в конец");
        System.out.println("4. Удалить по позиции");
        System.out.println("5. Выход");

        int command, count = 0;
        int arr[] = new int[100];

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите пункт меню ");
            command = scn.nextInt();

            switch (command) {

                case 1:
                    System.out.println("Элементы массива: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Введите элемент, который Вы хотите добавить в конец");
                    int input = scn.nextInt();
                    arr[count] = input;
                    count++;
                    break;

                case 3:
                    System.out.println("Введите элемент, который Вы хотите добавить в начало");
                    int input3 = scn.nextInt();
                    if(count <= 100) {
                        for (int i = count; i > 0; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[0] = input3;
                        count++;
                    } else {
                        System.out.println("Больше нельзя!");
                    }
                    break;

                case 4:
                    if (count > 0) {
                        System.out.println("Элемент какой позиции Вы хотите удалить?");
                        int input4 = scn.nextInt();
                        for (int i = input4; i < count; i++) {
                            arr[i] = arr[i + 1];
                        }
                        count--;
                    } else {
                        System.out.println("Массив пустой.");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Комманда не определена");
                        break;
            }

        }

    }

}

