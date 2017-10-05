package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // инзачально это массив null
        ArrayList lists[] = new ArrayList[5];
        // МЕНЮ
        // 1. Создать список (0..4) - создаете нужный список
        // 2. Показть все списки (показываются только ненулевые)
        // 3. Работа со списком - попросить ввести номер спика
        //       1. Добавить
        //       2. Удалить
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать список");
            System.out.println("2. Показать все списки (только ненулевые)");
            System.out.println("3. Работа со списком");
            System.out.println("4. Удаление массива");
            System.out.println("5. Выход");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0..4]");
                    int listNumber = scanner.nextInt();
                    lists[listNumber] = new ArrayList();
                    break;
                case 2:
                    System.out.println("Вывод ненулевых списков: ");
                    for (int i = 0; i < lists.length; i++) {
                        if (lists[i] != null) {
                            System.out.println("Список номер " + i + ": " + lists[i].showElements());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите номер списка, с которым Вы хотите работать");
                    int listWorking = scanner.nextInt();
                    if (lists[listWorking] == null) {
                        System.out.println("Такого списка не существует, братиш");
                    }
                    Boolean isTrue = true;
                    System.out.println("-----------------------------------------" +
                            "Работа со списком №" + listWorking + ":\n" +
                            "1.Добавить в конец\n" +
                            "2.Добавить в начало со сдвигом\n" +
                            "3.Вставить элемент в заданную позицию со сдвигом\n" +
                            "4.Получить элемент по индексу\n" +
                            "5.Замена по позиции\n" +
                            "6.Удалить элемент по позиции\n" +
                            "7.Найти индекс элемена в списке\n" +
                            "8.Сортировка по возрастанию\n" +
                            "9.Реверс\n" +
                            "10.Показать массив\n" +
                            "11.Назад на главное меню\n" +
                            "12.Показать меню\n" +
                            "-----------------------------------------------------\n");

                    while (isTrue) {
                        switch (scanner.nextInt()) {
                            case 1:
                                System.out.println("Какое число Вы хотите добавить в конец?");
                                lists[listWorking].add(scanner.nextInt());
                                break;
                            case 2:
                                System.out.println("Какое число Вы хотите добавить в начало?");
                                lists[listWorking].addToBegin(scanner.nextInt());
                                break;
                            case 3:
                                System.out.println("Какое число Вы хотите добавить в нужную позицию?");
                                int elem = scanner.nextInt();
                                System.out.println("Введите индекс");
                                int index = scanner.nextInt();
                                lists[listWorking].insert(elem, index);
                                break;
                            case 4:
                                System.out.println("Введите индекс элемента, который Вы хотите получить:");
                                int indexGetting = scanner.nextInt();
                                int indexGetted = lists[listWorking].get(indexGetting);
                                System.out.println("Элемент под индексом " + indexGetting + " - это " + indexGetted);
                                break;
                            case 5:
                                System.out.println("Элемент какой позиции Вы хотите заменить?");
                                int indexReplaced = scanner.nextInt();
                                System.out.println("Какой элемент вставить в позицию " + indexReplaced + "?");
                                int elementReplaced = scanner.nextInt();
                                lists[listWorking].replace(indexReplaced, elementReplaced);
                                break;
                            case 6:
                                System.out.println("Введите индекс элемента, который Вы хотите удалить:");
                                lists[listWorking].remove(scanner.nextInt());
                                break;
                            case 7:
                                System.out.println("Введите значение элемента, индекс которого Вы хотите найти: ");
                                int indexFoound = lists[listWorking].find(scanner.nextInt());
                                System.out.println("Индекс этого элемента " + indexFoound);
                                break;
                            case 8:
                                lists[listWorking].sort();
                                break;
                            case 9:
                                lists[listWorking].reverse();
                                break;
                            case 10:
                                System.out.println("Ваш массив: " + lists[listWorking].showElements());
                                break;
                            case 11:
                                isTrue = false;
                                break;
                            case 12:
                                System.out.println("-----------------------------------------" +
                                        "Работа со списком №" + listWorking + ":\n" +
                                        "1.Добавить в конец\n" +
                                        "2.Добавить в начало со сдвигом\n" +
                                        "3.Вставить элемент в заданную позицию со сдвигом\n" +
                                        "4.Получить элемент по индексу\n" +
                                        "5.Замена по позиции\n" +
                                        "6.Удалить элемент по позиции\n" +
                                        "7.Найти индекс элемена в списке\n" +
                                        "8.Сортировка по возрастанию\n" +
                                        "9.Реверс\n" +
                                        "10.Показать массив\n" +
                                        "11.Назад на главное меню\n" +
                                        "12.Показать меню\n" +
                                        "-----------------------------------------------------\n");
                                break;
                                default:
                                    System.out.println("Комманда неверна");
                                    break;
                        }

                    }
                    break;
                case 4:
                    System.out.println("Внимание! Для отмены удаления нажмите -1!");
                    System.out.println("");
                    System.out.println("Какой массив Вы хотите удалить?");
                    int numberOfArray = scanner.nextInt();
                    System.out.println("Внимание! Для отмены удаления нажмите -1!");
                    if (numberOfArray != -1) {
                        lists[numberOfArray] = null;
                    }
                    break;
                    default:
                        System.out.println("Комманда неверна");
                        break;
                case 5:
                    System.exit(0);
            }
        }
    }
}