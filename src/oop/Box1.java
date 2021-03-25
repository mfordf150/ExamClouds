package oop;

public class Box1 {
    double width; // ← свойства объекта, объект выглядит так Box1 mybox1 = new Box1();
    double height;//← свойства объекта
    double depth;  // ← свойства объекта


    double getVolume() { // получаем результат
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {  // устанавливаем свойства
        width = w;     // ← это  свойства объекта из класса  BoxDemo5
        height = h;   // сокрытие данных
        depth = d;

    }

}


