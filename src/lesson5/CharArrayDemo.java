package lesson5;
// создать двухмерный массив типа char размером 4х2, и записать туда значаения с помощью блока инициализации
//распечатать значения перебор сделать с помощью цикла forEach!
public class CharArrayDemo {
    public static void main(String[] args) {
        char[][]  array = {{'r','h'},{'y','g'},{'b','f'},{'s','e'}};
        for(char[] row : array) {
    //перебор строки↑      ↑перебор массива
    //row это строка
            for(char element :row) {
    //        тип char↑        ↑перебор строки
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
