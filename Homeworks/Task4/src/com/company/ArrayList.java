package com.company;


public class ArrayList {
    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 10;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    /**
     * Добавить элемент в конец
     * @param element
     */
    public void add(int element) {
        if (count < elements.length) {
            elements[count] = element;
            count++;
        } else {
            insert(element, count);
        }
    }

    /**
     * Добавить элемент в начало списка, со сдвигом вправо
     * @param element
     */
    public void addToBegin(int element) {
        insert(element, 0);
    }

    /**
     * Вставить элемент в заданную позицию со сдвигом
     * @param element сам элемент
     * @param index индекс, куда надо вставить
     */
    public void insert(int element, int index) {
        if (count < index || index < 0) {
            System.out.println("Неверный индекс");
        } else {
            if (count >= elements.length) {
                int[] tempArray = new int[elements.length + elements.length / 2];
                for (int i = 0; i < elements.length; i++) {
                    tempArray[i] = elements[i];
                }
                elements = tempArray;
            }
            for (int i = count; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            count++;
        }

    }

    public String showElements() {
        String message = "";
        if (count == 0) {
            message = "Массив пустой";
        } else {
            for (int i = 0; i < elements.length; i++) {
                message += elements[i] + " ";
            }
        }
        return message;
    }


    /**
     * Получить элемент по индексу
     * @param index
     * @return сам элемент по заданному индексу
     */
    public int get(int index) {
        if (count > index) {
            return elements[index];
        }
        return -1;
    }

    /**
     * Заменить элемент в заданной позиции новым элементом
     * @param index
     * @param element
     */
    public void replace(int index, int element) {
        if (index >= count || index < 0) {
            System.out.println("Неверный индекс");
        }
        elements[index] = element;

    }

    public void sort() {
        for (int i = count - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    public void reverse() {
        for (int i = 0; i < count / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[count - 1 - i];
            elements[count - 1 - i] = temp;
        }
    }


    public void remove(int index) {
        if (index >= count || index < 0) {
            System.out.println("Неверный индекс");
        }
        int[] tempArray = new int[elements.length - 1];
        for (int j = 0; j < index; j++) {
            tempArray[j] = elements[j];
        }
        for (int i = index; i < count - 1; i++) {
            tempArray[i] = elements[i + 1];
        }
        elements = tempArray;
        count--;
    }

    /**
     * Вернуть индекс элемента, если элемента нет = -1
     * @param element
     * @return
     */
    public int find(int element) {
        for(int i = count - 1; i >= 0; i--) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }
}