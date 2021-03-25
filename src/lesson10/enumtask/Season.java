package lesson10.enumtask;

public enum Season {
    WINTER(-20), SPRING(15), SUMMER(27) {
        @Override
        public String getDescription() {
            return "теплое время года";
        }
    },
    AUTUMN(8);

    private double avgTmp;

    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
