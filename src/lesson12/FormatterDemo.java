package lesson12;
// метод System.out.printf для форматирования строк, он чаще будет использоваться чем System.out.format
public class FormatterDemo {
    public static void main(String[] args) {
        print("Иванов",5,"Математика");
        print("Петрова",4,"Физика");

    }

    private static void print(String fullname, int mark,String subject) {

        System.out.printf("Студент %s получил %s по %s \n",fullname,mark,subject);
        System.out.format("Студент %s получил %s по %s \n",fullname,mark,subject);


    }
}
