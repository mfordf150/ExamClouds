package lesson12.strings;

// метод replace заменяет кусочек текста
public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Это простой текст");
        stringBuilder.replace(4,11, "был");
        System.out.println("После замены " + stringBuilder);

    }
}
