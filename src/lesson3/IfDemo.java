package lesson3;
/*
проверка на четное не четное число, с приминением "Integer.parseInt",
 */
public class IfDemo {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]); //конвертирует строки в число
        if(number % 2 != 0){  // остаток от деления на 2, если  не равно нулю, значит оно не четное!
            System.out.println(number);
        }
    }
}
