package Lesson9;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Draw circle with color " + getColor() + " "
                + this.getX() + " " + " " + this.getY() + " " + this.getRadius());

    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                "} " + super.toString();
    }
}

