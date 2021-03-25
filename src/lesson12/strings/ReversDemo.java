package lesson12.strings;
//метод reverse разворачивает строчку в обратном порядке
//часто в задачи бывает , надо проверить являеться ли оно палиндромом
//  слова палиндромом: мадам довод
public class ReversDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
