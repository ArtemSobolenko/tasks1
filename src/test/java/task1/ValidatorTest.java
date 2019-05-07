package task1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValidNumberOfArgumentsTest() {
        //GIVEN
        String[]args = new String[2];
        boolean expected;
        //THEN
        expected = this.validator.isValidNumberOfArguments(args);
        //WHEN
        Assert.assertTrue(expected);
    }
}