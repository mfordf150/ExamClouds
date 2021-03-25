package lesson7;

import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String n, String m, double w) {
        this(n, m); // если вызвать this программа будет короче
        weight = w; //чтобы не вводить number = n; model = m;
    }

    Phone(String n, String m) {
        number = n;
        model = m;

    }

    Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);

    }

    void receiveCall(String name, String number) { //JVM понимает по типу и количеству параметровров
        System.out.println("Calling " + name + " with number " + number);
        System.out.println("my number " + this.number);

    }

    String getNumber() {
        return number;
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("message " + message + " is sending to: ");
        System.out.println(Arrays.toString(numbers));
    }
}


