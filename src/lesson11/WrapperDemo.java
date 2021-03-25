package lesson11;

public class WrapperDemo {
    public static void main(String[] args) {
        Double double1 = 3.0;
        Double double2 = new Double("7");
        Double double3 = 4.0;
        Double double4 = Double.valueOf("7.8");

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
    }
}
