package lesson8;

public class Aspirant extends Student {
    String scienceWork;


    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;

    }

    public Aspirant(String scienceWork) {
        super();
        this.scienceWork = scienceWork;
    }


    public double getSchollarship() {
        return averageMark == 5 ? 200 : 180;
    }
}

