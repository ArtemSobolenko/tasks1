package task3;

import exception.AppException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleServiceTest {

    private Triangle triangle;
    private TriangleService triangleService;
    private String triangleName;
    private double sideA;
    private double sideB;
    private double sideC;

    @Before
    public void setUp() throws Exception {
        triangleName = "TestName";
        sideA = 5;
        sideB = 7;
        sideC = 9;
        triangle = new Triangle(triangleName, sideA, sideB, sideC);
        triangleService = new TriangleService();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createTriangleTest() throws AppException {
        //GIVEN
        Triangle actualTriangle = this.triangle;
        Triangle expectedTriangle;
        //WHEN
        expectedTriangle = triangleService.createTriangle(triangleName, sideA, sideB, sideC);
        //THEN
        assertEquals(actualTriangle, expectedTriangle);
    }

    @Test(expected = AppException.class)
    public void createTriangleWithWrongSideTest() throws AppException {
        triangleService.createTriangle(triangleName, 2, 2, 4);
    }

    @Test
    public void calculationAreaByHeronFormulaTest() {
        //GIVEN
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double actualArea = Math.sqrt(halfPerimeter *
                (halfPerimeter - sideA) *
                (halfPerimeter - sideB) *
                (halfPerimeter - sideC));
        //WHEN
        double expectedArea = triangleService.calculationAreaByHeronFormula(this.triangle);
        //THEN
        assertEquals(actualArea, expectedArea, 0.0);
    }
}