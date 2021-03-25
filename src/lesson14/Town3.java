package lesson14;

// Пример локального класса объявленного в СТАТИЧЕСКОМ методе
public class Town3 {
    private static String postCode = "3333";

    public static void createAddress() {
        final int houseNumber = 34;
        class Street {
            public void printAddress() {
                System.out.println("PostCode " + postCode);
                System.out.println("House Number is " + houseNumber);
            }

        }
        Street street = new Street();
        street.printAddress();

    }

    public static void main(String[] args) {
        Town3.createAddress();
    }
}
