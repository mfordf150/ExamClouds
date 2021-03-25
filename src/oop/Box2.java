package oop;

public class Box2 {
    double width;
    double height;
    double depth;
/*
конструктор нужен для создания объекта, и иницилизирует все его переменные по умолчанию
 */
    Box2() {
        System.out.println("конструктор объем объекта Box2");
        width =10;
        height = 10;
        depth = 10;
    }

    double getVolume() { // получаем результат
        return width * height * depth;
    }
}
