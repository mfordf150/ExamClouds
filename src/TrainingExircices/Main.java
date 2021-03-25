package TrainingExircices;

/*
Так и выглядит работа этого оператора. Тернарным (тройным) его называют потому,
что в его работе принимают участие 3 компонента:
Одно условие (man.getAge() >= 18)
Два возможных результата ("Все в порядке, проходите!" и "Этот фильм не подходит для вашего возраста!")
Вначале в коде записывается условие, после которого ставится вопросительный знак.
условие ? результат 1 : результат 2
 */
public class Main {
    private int age;

    public Main(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Main man = new Main(22);



  /*      if (man.getAge() >= 18) {
            securityAnswer = "Все в порядке, проходите!";
        } else {
            securityAnswer = "Этот фильм не подходит для вашего возраста!";
        }
        /*
   */
        String securityAnswer = (man.getAge() >= 18) ? "Все в порядке, проходите!" :
                "Этот фильм не подходит для вашего возраста!";

        System.out.println(securityAnswer);

    }
}