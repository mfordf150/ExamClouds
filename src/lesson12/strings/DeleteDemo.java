package lesson12.strings;
//удаление кусочек строки
//пример
public class DeleteDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test ");

        sb.delete(4,7);
        //4 позиция удалиться, а 7 останетсья, так как просто дойдет до 7 числа!
        System.out.println("После delete: " + sb);

        sb.deleteCharAt(0);
        //тут удалитсья первая буква слова
        System.out.println("После deleteChar: " + sb);
    }
}
