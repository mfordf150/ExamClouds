package lesson14;
//Пример локального класса

public class Town2 {
    private String postCode = " 3333";

    public void createAddress() {
        final int houseNumber = 34;
        class Street { // для этого класса нельзя использовать public static private protected, как и для
            public void printAddress() { // локальных переменных
                System.out.println("PostCode is " + postCode);
                System.out.println("House Number is " + houseNumber);
            }
        }

            Street street = new Street();
            street.printAddress();
        }

    public static void main(String[] args) {
        Town2 town = new Town2();
        town.createAddress();
    }

    }

