package task3;

import exception.AppException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleValidatorTest {

    private TriangleValidator triangleValidator;
    String params;

    @Before
    public void setUp() throws Exception {
        triangleValidator = new TriangleValidator();
        params = "Name, 12.4, 4, 14.5";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void validationParamsTest() throws AppException {
        //GIVEN
        String[] actualArgs = {"Name", "12.4", "4", "14.5"};
        String[] expectedArgs;

        //WHEN
        expectedArgs = triangleValidator.validationParams(params);

        //THEN
        Assert.assertArrayEquals(actualArgs, expectedArgs);
    }

    @Test(expected = AppException.class)
    public void validationWithWrongParamsTest() throws AppException {
        //GIVEN
        String wrongArgs = "name, 12";
        String[] actualArgs = {"Name", "12.4", "4", "14.5"};
        String[] expectedArgs;

        //WHEN
        expectedArgs = triangleValidator.validationParams(wrongArgs);

        //THEN

    }
}