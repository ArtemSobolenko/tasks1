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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Envelope)) return false;

        Envelope envelope = (Envelope) o;

        if (Double.compare(envelope.getSideA(), getSideA()) != 0) return false;
        return Double.compare(envelope.getSideB(), getSideB()) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getSideA());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSideB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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
            return 0;
        }
    }
}
