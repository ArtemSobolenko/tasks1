package task7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSequenceTest {

    private NumberSequence numberSequence;
    private int pow;

    @Before
    public void setUp() throws Exception {
        pow = 10;
        numberSequence = new NumberSequence(pow);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSequenceTest() {
        //GIVEN
        String actualResult = "1,4,9";
        String expectedResult;
        //WHEN
        expectedResult = numberSequence.getSequence();
        //THEN
        Assert.assertEquals(actualResult, expectedResult);
    }
}