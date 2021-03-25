package algoritms;

import java.util.Arrays;

public class SelectionSorterTest {
    public static void main(String[] args) {
        int[][] data = {
                {},  // <- два этих массива нужны, чтобы проверить
                {1}, // <- что программа не упадет при таких значения
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
//пишем одномерный ↓ массив и передаем его в ▓
        for (int[] arr : data) {
            //в двух.мер массиве ↑, перебираем строчки
            System.out.println(Arrays.toString(arr) + " => ");
            BubbleSorter.sort(arr); // <- метод sort ▓
            System.out.println(Arrays.toString(arr));
        }
    }
}

