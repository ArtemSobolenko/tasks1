package task5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWorldTest {
    private NumberToWorld numberToWorld;
    private int number;

    @Before
    public void setUp() throws Exception {
        number = 1876421;
        numberToWorld = new NumberToWorld(number, new StringBuilder());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNumberLikeStringTest() {
        //GIVEN
        String expectedString = "один миллион восемьсот семьдесят шесть тысяч четыреста двадцать один";
        //WHEN
        String actualString = numberToWorld.getNumberLikeString();
        //THEN
        assertEquals(actualString, expectedString);
    }
}