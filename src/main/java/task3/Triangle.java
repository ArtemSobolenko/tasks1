package task3;

public class Triangle implements Comparable<Triangle> {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int compareTo(Triangle o) {
        if (o.area > this.area) {
            return 1;
        } else if (o.area < this.area) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]: " + area + " cm";
    }
}