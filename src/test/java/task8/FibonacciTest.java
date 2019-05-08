package task8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void getFibonacciSequenceTest() {
        //GIVEN
        int start = 20;
        int end = 60;
        String actualFibonacciSequence = "21, 34, 55";
        String expectedFibonacciSequence;
        //WHEN
        expectedFibonacciSequence = Fibonacci.getFibonacciSequence(start,end);
        //THEN
        assertEquals(actualFibonacciSequence, expectedFibonacciSequence);
    }
}