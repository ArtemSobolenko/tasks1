package task2;

public class Envelope implements Comparable<Envelope> {
    private double sideA;
    private double sideB;

    public Envelope(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }


    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public int compareTo(Envelope e) {
        double minSide1 = this.getMinSide();
        double minSide2 = e.getMinSide();
        double maxSide1 = this.getMaxSide();
        double maxSide2 = e.getMaxSide();

        if (compareSides(maxSide1, maxSide2) == 1 && compareSides(minSide1, minSide2) == 1) {
            return 1;
        }
        if (compareSides(maxSide1, maxSide2) == -1 && compareSides(minSide1, minSide2) == -1) {
            return -1;
        }
        return 0;

//        double a = this.getSideA();
//        double b = this.getSideB();
//        double c = e.getSideA();
//        double d = e.getSideB();
//
//        if (d <= b && (c <= a || b * (c * c + d * d) >= (2 * c * d * a + (c * c - d * d) * sqrt(c * c + d * d - a * a)))) {
//            return 1;
//        } else {
//            return -1;
//        }
    }

    private static int compareSides(double a, double b) {

        if ((a - b) > 0) {
            return 1;
        } else {
            return (a - b) < 0 ? -1 : 0;
        }
    }

    private double getMinSide() {
        return compareSides(sideA, sideB) == 1 ? sideB : sideA;
    }

    private double getMaxSide() {
        return compareSides(sideA, sideB) == -1 ? sideB : sideA;
    }
}
