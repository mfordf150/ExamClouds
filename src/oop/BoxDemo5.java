package oop;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.depth = 200;
        myBox2.height = 236;
        myBox2.width = 3321;

        System.out.println("Объем " + myBox1.getVolume()); //getVolume вызов метода, для myBox1
        System.out.println("Объем " + myBox2.getVolume()); //getVolume вызов метода, для myBox2
    }
}
