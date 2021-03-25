package oop;

public class BoxDemo1 {
    public static void main(String[] args) { // <== отсюда запускаеться программа
        Box1 myBox = new Box1(); // создание объекта

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        double volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объем равен " + volume);
    }
}
