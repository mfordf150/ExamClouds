package lesson8;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Grop1", 4);
        Aspirant aspirant1 = new Aspirant("Petr", "Petrov", "Group2", 5, "ScienceWork1");
        Student aspirant2 = new Aspirant("Sidor", "Sidorov", "Group3", 5, "scienceWork2");
        Student[] students = {student1, aspirant1, aspirant2};

   /*     System.out.println(aspirant1.firstName + " " + aspirant1.lastName +
                " " + aspirant1.group + " " + aspirant1.averageMark + aspirant1.scienceWork);

        System.out.println(aspirant2.firstName + " " + aspirant2.lastName +
                " " + aspirant2.group + " " + aspirant2.averageMark + aspirant2.averageMark);
*/
    // перебор массива "students", а элементы будем записывать в переменную student
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName +
                    " " + student.getSchollarship());
        }

    }
}
