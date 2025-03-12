package ru.sshibko;

public class ReverseArray_4 {

    int[] arr = {1, 2, 3, 4, 5};

    public int[] reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
/**
4. Перевернуть массив.
    Для переворачивания массива в Java можно использовать цикл for, меняя местами элементы массива.
    */
}
