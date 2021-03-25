package oop;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.setDim(10,20,15);  // ← это  свойства объекта из класса  BoxDemo5
        myBox2.setDim(200,236,3321);

        System.out.println("Объекм  " + myBox1.getVolume());
        System.out.println("Объекм " + myBox2.getVolume());

    }

}
