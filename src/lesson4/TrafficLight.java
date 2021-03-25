package lesson4;

public class TrafficLight {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("Зеленый");
                break; // break нужен для выхода из switch!
            case 2:
                System.out.println("Желтый");
                break;
            case 3:
                System.out.println("Красный");
                break;
            default:
                System.out.println("Не правильно введено число");
                break;
        }
    }
}
