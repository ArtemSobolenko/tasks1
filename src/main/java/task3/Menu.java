package task3;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private TriangleService triangleService;
    private TriangleValidator triangleValidator;

    public Menu(TriangleService triangleService, TriangleValidator triangleValidator) {
        this.triangleService = triangleService;
        this.triangleValidator = triangleValidator;
    }

    public void show() {
        List<Triangle> triangleList = new ArrayList<>();
        String[] params;
        int indexForName = 0;
        int indexForSideA = 1;
        int indexForSideB = 2;
        int indexForSideC = 3;
        double triangleArea;
        do {
            ConsoleHelper.print("Enter the parameters of the triangle in the form: " +
                    "<name>, <side length>, <side length>, <side length>\n");
            try {
                params = triangleValidator.validationParams(ConsoleHelper.getDataFromConsole());
                Triangle triangle = triangleService.createTriangle(params[indexForName],
                        Utils.getDoubleFromParam(params[indexForSideA]),
                        Utils.getDoubleFromParam(params[indexForSideB]),
                        Utils.getDoubleFromParam(params[indexForSideC]));
                triangleArea = triangleService.calculationAreaByHeronFormula(triangle);
                triangle.setArea(triangleArea);
                triangleList.add(triangle);
            } catch (AppException e) {
                ConsoleHelper.print("Exception:\n" + e);
            }
        } while (isRun());
        triangleList.sort(new TriangleAreaComparator());
        triangleService.printTriangles(triangleList);
    }

    private boolean isRun() {
        System.out.println("Do you want to continue...?\n\"y\"/\"yes\"\n");
        String answer = ConsoleHelper.getDataFromConsole().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }
}
