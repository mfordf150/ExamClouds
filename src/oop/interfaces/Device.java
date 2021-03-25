package oop.interfaces;
/*
Если класс реализует интерфейс, но не полностью реализует определнные в нем методы (не все методы),
он должен
быть объявлен как abstract
 */
public abstract class Device implements Moveable {
    public void moveRight() {
        System.out.println("Девайс поворачивает вправо");
    }
}