package task9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FastPowTest {

    @Test
    public void binaryFastPowTest() {
        //GIVEN
        int a = 2;
        int b = 3;
        int actualResult = 8;
        //WHEN
        int expectedResult = FastPow.binaryFastPow(2,3);
        //THEN
        Assert.assertEquals(actualResult, expectedResult);
    }
}