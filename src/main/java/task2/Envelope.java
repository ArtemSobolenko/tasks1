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
        double a = this.getSideA();
        double b = this.getSideB();
        double c = e.getSideA();
        double d = e.getSideB();

        if (d <= b && (c <= a || b * (c * c + d * d) >= (2 * c * d * a + (c * c - d * d) * Math.sqrt(c * c + d * d - a * a)))) {
            return 1;
        } else {
            return -1;
        }
    }
}
