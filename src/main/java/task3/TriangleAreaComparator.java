package task3;

import java.util.Comparator;

public class TriangleAreaComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {
        Double area1 = o1.getArea();
        Double area2 = o2.getArea();
        return area2.compareTo(area1);
    }
}
