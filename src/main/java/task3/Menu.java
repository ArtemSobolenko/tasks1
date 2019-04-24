package task3;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {
    private Utils utils;
    private TriangleService triangleService;
    private TriangleValidator triangleValidator;

    public Menu(Utils utils, TriangleService triangleService, TriangleValidator triangleValidator) {
        this.utils = utils;
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
        do {
            ConsoleHelper.print("Enter the parameters of the triangle in the form: <name>, <side length>, <side length>, <side length>\n");
            try {
                params = triangleValidator.validationParams(ConsoleHelper.getDataFromConsole());
                Triangle triangle = triangleService.createTriangle(params[indexForName],
                        utils.getDoubleFromParam(params[indexForSideA]),
                        utils.getDoubleFromParam(params[indexForSideB]),
                        utils.getDoubleFromParam(params[indexForSideC]));
                triangle.setArea(triangleService.calculationAreaByHeronFormula(triangle));
                triangleList.add(triangle);
            } catch (AppException e) {
                e.printStackTrace();
            }
        } while (isRun());
        Collections.sort(triangleList, new TriangleAreaComparator());
        triangleService.printTriangles(triangleList);
    }

    private boolean isRun() {
        System.out.println("Do you want to continue...?\n\"y\"/\"yes\"\n");
        String answer = ConsoleHelper.getDataFromConsole().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }
}
