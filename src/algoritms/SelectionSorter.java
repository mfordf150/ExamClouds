package algoritms;
//сортировка выборкой
public class SelectionSorter {
    public static void sort(int[]array) {
        for (int i = 0; i < array.length ; i++) { // i - отвечает за количество прохода
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < min) {
                    pos = j;       // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }

            array[pos] = array[i];
            array[i] = min;    // меняем местам наименьший с array[i]
        }
    }
}
