package lesson2;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        if(scanner.hasNext()) {
            int i = scanner.nextInt();
            System.out.println(i);

        }else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
