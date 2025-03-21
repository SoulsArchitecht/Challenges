package ru.sshibko;

public class SelectionSort_7 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

/**    Находим минимальный элемент в массиве.

    Меняем его местами с первым элементом.

    Повторяем шаги 1 и 2 для оставшейся части массива, начиная со второго элемента и до конца.*/

    public static void improvedSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

/**
 *  Для улучшения этого алгоритма можно использовать следующие оптимизации:

    Добавить проверку, нужно ли менять элементы местами. Если элементы уже стоят в правильном порядке,
    то нет нужды менять их местами.
    Оптимизировать поиск минимального элемента. Вместо того, чтобы каждый раз проходить по всему неотсортированному
    массиву, можно сохранить индекс минимального элемента на предыдущих шагах сортировки и начинать следующий поиск
    от следующего элемента.

 Здесь мы добавили проверку на равенство i и minIdx, чтобы не менять элементы местами, если они уже стоят в правильном
 порядке. Мы также сохраняем индекс минимального элемента на предыдущих шагах сортировки, чтобы начинать следующий
 поиск минимального элемента от следующего элемента.*/


}
