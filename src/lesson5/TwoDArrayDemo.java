package lesson5;
//Создать массив размером 3х6 типа String от а1 до с6

public class TwoDArrayDemo {
    public static void main(String[] args) {
        char symbol = 'a';
        String[][] array = new String[7][10];
        for(int i = 0; i <array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = symbol + "" + (j+1);
                System.out.print(array[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}
