package lesson14;
//статические переменные не инициализируются в конструкторе
//для этого используеться статичемкий метод

public class User3 {
    private static String login, password;

    public static class Query {
        public void printToLog() {
            System.out.printf("User with login %s and password %s sent query\n",
                    login, password);
        }
    }
     //статичемкий метод↓
    public static void initialize(String login, String password) {
        User3.login = login;
        User3.password = password;
    }


    public static void main(String[] args) {
        initialize("login1", "password");

        User3.Query query = new User3.Query();
        query.printToLog();


    }

}
