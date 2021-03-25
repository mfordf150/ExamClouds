package oop;

public class Overloading2 {
    void test() {
        System.out.println("без параметров");
    }

    double test(double a) { // ← мнтод с параметрами
        System.out.println("double a " + a);
        return a*a;
    }

    public static void main(String[] args) {
        Overloading2 ob = new Overloading2();

        ob.test();
        double result = ob.test(123.25);
        System.out.println("результат вызова метода ob.test(123.25): " + result);
    }
}
