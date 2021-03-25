package lesson10.enumtask;
/*
enum перечесление с помощью switch case;
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season season1 = Season.SUMMER;
        System.out.println(season1);
        print(Season.AUTUMN);
        printAllValues(); // просто вызываем этот метод, ничего не передаем в него

        Season season2 = Season.valueOf("WINTER");
        System.out.println(season2);
    }
    public static void print(Season season) {
        switch (season){
            case WINTER:
                System.out.println("I like winter");
                break;case SPRING:
                System.out.println("I like Spring");
                break;case SUMMER:
                System.out.println("I like Summer");
                break;case AUTUMN:
                System.out.println("I like Autumn");
                break;
        }

    }
    public static void printAllValues(){
        for(Season s : Season.values()){
            System.out.println(s + " " + s.getAvgTmp()+ " "
            + s.getDescription());
        }
    }
}
