package task2;

import console.ConsoleHelper;

public class EnvelopeService {

    public Envelope createEnvelope(double sideA, double sideB) {
        return new Envelope(sideA, sideB);
    }

    public void compareEnvelopes(Envelope envelope1, Envelope envelope2) {
        if (envelope1.compareTo(envelope2) != 0) {
            ConsoleHelper.print(envelope1.toString() + " is fit for " + envelope2.toString());
        } else {
            ConsoleHelper.print(envelope1.toString() + " isn't fit for " + envelope2.toString());
        }
    }
}
