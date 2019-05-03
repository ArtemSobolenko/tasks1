package task3;

import console.ConsoleHelper;
import exception.AppException;

import java.util.List;

public class TriangleService {

    public Triangle createTriangle(String name, double sideA, double sideB, double sideC) throws AppException {
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            return new Triangle(name, sideA, sideB, sideC);
        } else {

            throw new AppException("That triangle can't exist!");
        }
    }


    public double calculationAreaByHeronFormula(Triangle triangle) {
        double halfPerimeter = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        double area = Math.sqrt(halfPerimeter *
                (halfPerimeter - triangle.getSideA()) *
                (halfPerimeter - triangle.getSideB()) *
                (halfPerimeter - triangle.getSideC()));
        return area;
    }


    public void printTriangles(List<Triangle> triangles) {
        if (triangles.size() == 0) {
            ConsoleHelper.print("Triangles not found!");
        } else {
            ConsoleHelper.print("============= Triangles list: ===============");
            for (Triangle triangle : triangles) {
                ConsoleHelper.print(triangle.toString());
            }
        }
    }
}
