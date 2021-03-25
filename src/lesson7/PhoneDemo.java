package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89046078270", "Samsung",1.2); // объект создан, Phone имя класса, phone1 имя переменной
        Phone phone2 = new Phone("89117002143", "Motorola");
        Phone phone3 = new Phone();




       // phone2.weight = 1.7;

        System.out.println(phone1.getNumber());//чтобы не использовать на прямую переменную number
        System.out.println(phone1.model);      //используем метод getNumber())
        System.out.println(phone1.weight);

        System.out.println();


        System.out.println(phone2.getNumber()); //чтобы не использовать на прямую переменную number
        System.out.println(phone2.model);    //используем метод getNumber())
        System.out.println(phone2.weight);

        System.out.println();

        System.out.println(phone3.getNumber());//чтобы не использовать на прямую переменную number
        System.out.println(phone3.model);      //используем метод getNumber())
        System.out.println(phone3.weight);

        phone1.receiveCall("мама"); // вызов метода receivCall
        phone2.receiveCall("папа"); // вызов метода receivCall
        phone2.receiveCall("сестра", "89046784590"); //JVM понимает по типу и количеству параметров

        phone1.sendMessage("Message111","064447","321345");
        phone2.sendMessage("Message222","063337");
    }
}
