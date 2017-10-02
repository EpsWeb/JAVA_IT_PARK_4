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
            System.out.println("1. Создать список (0..4)");
            System.out.println("2. Показать все имеющиеся списки");
            System.out.println("3. Работа со списком");
            System.out.println("4. Удалить список");
            System.out.println("5. Выход");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0..4]");
                    int listNumber = scanner.nextInt();
                    if (listNumber < 0 || listNumber > 4) {
                        System.out.println("Неверно введён номер создаваемого списка (только 0.. 4)");
                    } else if (lists[listNumber] != null) {
                        System.out.println("Этот список уже создан");
                    } else {
                        lists[listNumber] = new ArrayList();
                    }
                    break;
                case 2:
                    System.out.println("Вывод ненулевых массивов в консоль:");
                    for (int i = 0; i < lists.length; i++) {
                        if (lists[i] != null) {
                            System.out.println("Список №" + i + ": " + lists[i].showElements());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите номер существующего списка:");
                    int listNumberWorked = scanner.nextInt();
                    if (lists[listNumberWorked] == null) {
                        System.out.println("Такого списка нет, чувачок");
                    } else {
                        boolean isTrue = true;
                        System.out.println("-----------------------------------------" +
                                "Работа со списком №" + listNumberWorked + ":\n" +
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
                                    System.out.println("Введите число для добавления его в конец:");
                                    lists[listNumberWorked].add(scanner.nextInt());
                                    break;
                                case 2:
                                    System.out.println("Введите число для добавления его в начало:");
                                    lists[listNumberWorked].addToBegin(scanner.nextInt());
                                    break;
                                case 3:
                                    System.out.println("Введите число для добавления его в нужную позицию:");
                                    int insertingElement = scanner.nextInt();
                                    System.out.println("Введите индекс добавляемого элемента:");
                                    int insertingindex = scanner.nextInt();
                                    lists[listNumberWorked].insert(insertingElement, insertingindex);
                                    break;
                                case 4:
                                    System.out.println("Введите индекс желаемого элемента:");
                                    int indexGetting = scanner.nextInt();
                                    int indexGetted = lists[listNumberWorked].get(indexGetting);
                                    System.out.println("Элемент под индексом " + indexGetting + " равен " + indexGetted);
                                    break;
                                case 5:
                                    System.out.println("Введите индекс заменяемого элемента:");
                                    int indexReplacing = scanner.nextInt();
                                    System.out.println("Введите новое значение заменяемого элемента:");
                                    int valueReplacing = scanner.nextInt();
                                    lists[listNumberWorked].replace(indexReplacing, valueReplacing);
                                    break;
                                case 6:
                                    System.out.println("Введите индекс удаляемого элемента:");
                                    lists[listNumberWorked].remove(scanner.nextInt());
                                    break;
                                case 7:
                                    System.out.println("Введите значение элемента, индекс которого Вы хотите найти:");
                                    int foundedIndex = lists[listNumberWorked].find(scanner.nextInt());
                                    System.out.println("Элемент находится на позиции " + foundedIndex);
                                    break;
                                case 8:
                                    lists[listNumberWorked].sort();
                                    break;
                                case 9:
                                    lists[listNumberWorked].reverse();
                                    break;
                                case 10:
                                    String showArray = lists[listNumberWorked].showElements();
                                    System.out.println("Ваш массив: " + showArray);
                                    break;
                                case 11:
                                    isTrue = false;
                                    break;
                                case 12:
                                    System.out.println("-----------------------------------------" +
                                            "Работа со списком №" + listNumberWorked + ":\n" +
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
                                        System.out.println("Вы ввели неверную команду!");
                                        break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Какой список Вы хотите удалить?");
                    int listDeleting = scanner.nextInt();
                    if (lists[listDeleting] == null) {
                        System.out.println("Этого списка и так не существует, братиш");
                    } else {
                        lists[listDeleting] = null;
                    }
                    default:
                        System.out.println("Вы ввели неверную команду!");
                        break;
            }
        }


    }
}