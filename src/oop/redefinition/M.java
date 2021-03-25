package oop.redefinition;

public class M {
    public int i;
    public int j;

    public M(int i, int j) {
        this.i = i;
        this.j = j;
    }
//если сделать метод ↓private, то переопределить его в классе N нельзя, будет ошибка компиляции
    public void print() {
        System.out.println("Print in M "
                + " i = " + i
                + " j = " + j);
    }
}
