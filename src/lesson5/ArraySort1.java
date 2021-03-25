package lesson5;

import java.util.Arrays;
//сортировка массива  с помощью метода Array.sort, сортировка идет по возрастанию

public class ArraySort1 {
    public static void main(String[] args) {
        int[] array = new int [] {3,1,5,6,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
