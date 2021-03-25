package lesson14;
//Пример обычно внутреннего класса
public class Town {
    private String postCode = "3333";

    public class Street {
        public void printAddress() {
            System.out.println("Town is " + Town.this);
            System.out.println("PostCode is " + postCode);
            System.out.println("Steet is " + this);
        }
    }
    public void createStreet() {
        Town town = new Town();
        town.createStreet();
        Town.Street street1 = town.new Street();
        Town.Street street2 = new Town(). new Street();
        street1.printAddress();
        street2.printAddress();
    }
}
