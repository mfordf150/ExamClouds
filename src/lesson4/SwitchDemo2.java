package lesson4;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String str = "potato";
        switch (str) {
            case "tomato":
                System.out.println("tomato");
                break;
            case "potato":
                System.out.println("potato");
                break;
            case "cucumber":
                System.out.println("cucumber");
                break;
            default:
                System.out.println("any");
                break;
        }
    }
}
