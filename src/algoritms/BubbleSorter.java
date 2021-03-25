package algoritms;
//сортировка пузырьком, "элемент должен быть отсортирвоан, по возрастанию"
public class BubbleSorter {
    public static void sort(int[] array) {// на вход передаеться массив array, который нужно отсортирвоать
        // i - номер прохода, по массиву
        for (int i = 0; i < array.length - 1; i++) {// первый цикл отвечает, за номер прохода
            // array.length - 1 количество проходов
            for (int j = array.length - 1; j > i; j--) {
                //внутренний цикл отвечает за перебор, элементво внтури каждого перебора
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }

            }
        }
    }
}