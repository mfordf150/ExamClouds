package lesson4;
/*
проход по циклу
 */
public class BreakLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + " ");
            for (int j = 0; j < 100; j++) { //внутриний цикл
                if (j == 10) {
                    break;           // выход их внутринегоцикла
                } //если убрать if и break, то внутриний цикл выведит 100
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершины");
    }
}

