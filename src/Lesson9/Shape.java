package Lesson9;

import java.util.Objects;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle("red ", 3, 4, 45);
        Circle circle2 = new Circle("black ", 5, 7, 3);
        Rectangle rectangle = new Rectangle("blue", 1, 2, 3, 4);
        shapes[0] = circle;
        shapes[1] = circle2;
        shapes[2] = rectangle;
        for (Shape shape : shapes) {
      //      shape.draw();
            System.out.println(shape);
        }

    }
}
