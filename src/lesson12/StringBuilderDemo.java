package lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = createSomestring(3, 56);

        System.out.println(stringBuilder1);

        modifySomeString(stringBuilder1,"=", "равно"); //вызов метода
        modifySomeString(stringBuilder1, "+","плюс");
        modifySomeString(stringBuilder1, "-","минус");
        modifySomeString(stringBuilder1, "*","умножить");
        System.out.println(stringBuilder1);

    }

    private static StringBuilder createSomestring(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }
//метод стал уневерсальным
    private static void  modifySomeString(StringBuilder stringBuilder,
                                                  String oldString,
                                                  String newString) {

        int pos;     // это код будет таким же что и снизу, но короче запись
        while ((pos = stringBuilder.indexOf(oldString)) != -1) {
         stringBuilder.replace(pos,pos+1, newString);
        }




        /* int pos;
        нужно изменить "=" на равно!
        нужно условие чтобы выйти из цикла, метод indexOf вернет -1, если "=" больше в строке нет
        вызываетсья метод  indexOf результат записываеться в pos
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            //сдесь же нужно проверить, что этот pos не равен  -1, берем все в скобки и добавляем != -1
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно "); //поместить  в цикл while, нажать ctrl+alt+T


        }
        return stringBuilder;

         */


    }

}
