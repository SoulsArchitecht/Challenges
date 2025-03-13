package ru.sshibko;

public class Bubble_Sort_6 {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void improvedBubbleSort(int[] arr) {
        boolean swapped = false;

        while (!swapped) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }

    }

    public static void improvedBubbleSort2(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        for (int i = 0; i < n - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

/**    Здесь мы используем два вложенных цикла for, чтобы перебрать все элементы массива и сравнить их между собой.
 * Если элементы стоят в неправильном порядке, то мы меняем их местами с помощью временной переменной temp.

    Данный алгоритм можно улучшить следующими способами:
    Добавить проверку, отсортирован ли уже массив. Если на какой-то итерации не происходит обмена, значит массив
    уже отсортирован, и можно завершить сортировку.

    Вместо двойного цикла использовать один цикл и флаг, который будет указывать, были ли за последний проход обмены.
    Если обменов не было, то сортировка завершена.
 */
}
