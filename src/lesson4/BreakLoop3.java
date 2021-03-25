package lesson4;
//Оператор break с меткой, шта?
public class BreakLoop3 {
    public static void main(String[] args) {
        boolean t = true;
        first:  // метка 1
        {                         // меткой помечаетсья какой-то блок кода! ▓
                                  //в данном случае помечаетсья "second" метка 2 ▓
            second: // метка 2
            {//▓
                third: // метка 3
                {
                    System.out.println("перед break");
                    if (t) {
                        break second; // break нужен для выхода из блока кода который помечен
                        // меткой second
                    }
                    System.out.println("Этот код не будет выполнен");
                }
                System.out.println("Этот код не будет выполнен");
            }//▓
            System.out.println("После второго блока");
        }
    }
}
