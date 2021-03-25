package lesson13;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1991,1,5);
        LocalDate today = localDate.now();
        System.out.println(localDate);
        System.out.println(today);

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        System.out.println(today.isAfter(localDate));
        System.out.println(today.isBefore(localDate));


    }
}
