package lesson4;
// вывести все числа, при добавление метода continnue▓, выведит не четные числа!
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
         if(i % 2 == 0) { // <-- итерации
         continue; // ▓ выходит только из текущей итерации
         }
        System.out.println(i + " ");
        }
    }
}
