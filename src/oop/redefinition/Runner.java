package oop.redefinition;
//Статические методы не переопределяються, так как нет объекта
//тут типа класса Base
public class Runner {
    public static void main(String[] args) {
        Base ob = new Sub();
        ob.go();
        Sub.go();
    }
}
