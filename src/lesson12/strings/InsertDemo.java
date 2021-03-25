package lesson12.strings;

// добавление подстроки
//Пример:
public class InsertDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I java! ");
        sb.insert(2, "like ");
        System.out.println(sb);
    }
}
