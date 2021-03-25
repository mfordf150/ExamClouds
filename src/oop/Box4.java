package oop;

public class Box4 {

    double width;
    double height;
    double depth;


    // обращение к Параметрам метода ↓
    Box4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume(){
        return this.width*height*depth; //обрпщение к переменнам класса
    }
}
