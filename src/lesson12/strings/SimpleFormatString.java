package lesson12.strings;

import java.util.Formatter;

public class SimpleFormatString {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about \n%S %c", "book", "java", '9');
        System.out.println(f);
    }
}
