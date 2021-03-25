package lesson10.print;

/*
массив Printable может содержать объекты любого класса, который реализуют этот интерфейс
в данном случаи объекты book▓ and magazine ▓
 */
public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");


        Magazine magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");

        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Print newspaper");
            }
        };
        Printable[] printables = {book1, book2, magazine1, magazine2, newspaper};// ▓

        for (Printable p : printables) {
            p.print();

        }
     //   Magazine.printMagazines(printables);
    }
}
