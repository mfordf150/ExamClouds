package oop.abstracts;

// так как класс абстрактный, то и  методы тоже абстрактны
//абстрактный метод,только в абстрактном классе
public abstract class Figure2 {
    double dim1;
    double dim2;

    public Figure2(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area2();
}
