package lesson4;
// перебор массива
/*
При прохождение цикла переменной str автоматичемки присваиваетсья значение, равное значение
сделующего элемента массива args
 */
public class forEach {
    public static void main(String[] args) {
        for(String str : args) {
            System.out.println("Значение " + str);
        }
    }
}
