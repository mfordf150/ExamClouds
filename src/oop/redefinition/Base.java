package oop.redefinition;
//Статические методы не переопределяються, так как нет объекта
public class Base {
    public static void go() {
        System.out.println("Метод из Base");
    }
}
