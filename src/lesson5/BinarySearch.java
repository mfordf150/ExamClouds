package lesson5;
/*
Array.binarySearch, возвращает номер элемента массива, если нет искомого элемента нет,
то возвращается -(position +1), где position - позиция элемента где он МОГ БЫ БЫТЬ
массив должен быть отсортирован, иначе результат метода не определен!
 */
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40};
        int pos1 = Arrays.binarySearch(array1,20);
        int pos2 = Arrays.binarySearch(array1,25);

    }
}
