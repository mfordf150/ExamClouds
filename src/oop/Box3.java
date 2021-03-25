package oop;

public class Box3 {
//чтобы вызвать конструктор по умолчанию в BoxDemo4 " Box3 myBox1 = new Box3"
//нужно написать в Box3, конструкто → Box3() {}
    double width;
    double height;
    double depth;
//Параметрезированные констуркторы↓
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }


}
