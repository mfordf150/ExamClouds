package oop.redefinition;

/*
чтобы обратиться к методу public void print из класса M,
находясь в классе N, нужно добавить super
 */
public class N extends M {
    public int k;

    public N(int i, int j, int k) {
        super(i, j);  //← super
        this.k = k;
    }
    public void print() {
        System.out.println("Print in K "
                + " k = " + k);
    }
    public void someMethod() {
        print();
    }
    /*   ↑
    Когда переопределнный метод вызыветься из своего класса он всегда
    ссылаетсья на свой вариант, определенный в подклассе. а вариант метода
    определнный в суперклассе будет скрыт!
    Пример  M obj3 = new N(1,2,3);
        obj3.print();
     */
    // когда переопределяем методы, синтаксис метода должен быть одинаковым,возвращаемый тип
    // имя и параметры, если параметры будут отличатсья, то это уже будет перегруженный метод
}
