package lesson4;
/*
вывод алфавита с буквы h! ▓
 */
public class forDemo {
    public static void main(String[] args) {
        char symbol = 'h';
        for (int i = 0; i < 15; i++){  // количество букв, которые выведит программа!
            System.out.print(symbol++ + " "); //увеличить переменную "инкремент" symbol++ // ▓
                                              //и добавить конактенацию
        }
    }
}
