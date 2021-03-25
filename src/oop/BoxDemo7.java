package oop;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.depth = 200;
        myBox2.height = 236;
        myBox2.width = 3321;

         double volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Объем равен " + volume);

        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Объем равен " + volume);
    }
}
