package lesson3;
/*
ctrl+alt+M для генирации нового метода, "выделить кусок кода который нужно перенести в отдельный метод !
 */
import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.im это строчка для связки с клавиатурой!
        if (scanner.hasNextInt()){
            compareNumber(scanner);  //   compareNumber(scanner);  <- вызов метода  ▓
        }else {
            System.out.println("Значение введено не верно ");
        }
    }

    private static void compareNumber(Scanner scanner) { // ▓
        int number = (scanner.nextInt());
        if(number > 0 && number < 10) {
            System.out.println("Положительное число меньше 10");
        }else {
            System.out.println("Положительное число больше 10 или отрицательное");

        }
    }
}
