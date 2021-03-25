package oop.redefinition;

public class OverrideDemo {
    public static void main(String[] args) {
        M obj1 = new M(7,8);
        obj1.print();

        N obj2 = new N(4,5,6);
        obj2.print();
//M это ↓ super,N это ↓ подкласс
        M obj3 = new N(1,2,3);
        obj3.print(); //вызовиться параметры  N
    }
    //ПЕРЕМЕННАЯ класса M но,↑ переменная указывает на объект подкласса N
}
