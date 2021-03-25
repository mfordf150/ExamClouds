package lesson4;

public class DoWhile {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println("Тик " + n++);/*
             в doWhile Сначало выполниться тело, а потом провериться условие
             тело выполниться хотябы один раз, так условие проверяеться в конце
             */
        } while (n <= 100 );
    }
}
