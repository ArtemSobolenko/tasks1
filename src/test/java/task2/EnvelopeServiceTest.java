package task2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnvelopeServiceTest {
    private Envelope envelope;
    private EnvelopeService envelopeService;
    private double sideA;
    private double sideB;

    @Before
    public void setUp() throws Exception {
        sideA = 10.4;
        sideB = 12.4;
        envelope = new Envelope(sideA, sideB);
        envelopeService = new EnvelopeService();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createEnvelopeTest() {
        //GIVEN
        Envelope envelope;
        //WHEN
        envelope = envelopeService.createEnvelope(sideA, sideB);
        //THEN
        Assert.assertTrue(envelope.equals(this.envelope));
    }

    @Test
    public void compareEnvelopesTest() {
        //GIVEN
        Envelope envelope1 = new Envelope(5, 7);
        Envelope envelope2 = new Envelope(8, 10);
        String actualResult = envelope1.toString() + " isn't fit for " + envelope2.toString();
        String expectedResult;
        //WHEN
        expectedResult = envelopeService.compareEnvelopes(envelope1, envelope2);
        //THEN
        Assert.assertEquals(actualResult, expectedResult);
    }
}