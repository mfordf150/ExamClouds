package lesson5;
import java.util.Arrays;
// метод  DeepToString более глубокий
public class ArrayDeepToString {
    public static void main(String[] args) {
        String [][] array = {{"один-один", "один-два", "один-три"},{"два-один", "два-два", "два-три"}};
        System.out.println(Arrays.deepToString(array));
    }
}
