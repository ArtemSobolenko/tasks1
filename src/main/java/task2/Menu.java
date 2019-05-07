package task2;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class Menu {

    private EnvelopeService envelopeService;

    public Menu(EnvelopeService envelopeService) {
        this.envelopeService = envelopeService;
    }

    public void show() {
        Envelope envelopeOne;
        Envelope envelopeTwo;
        do {
            try {
                ConsoleHelper.print("Enter sideA for first envelope...");
                double sideA = Utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                ConsoleHelper.print("Enter sideB for first envelope...");
                double sideB = Utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                envelopeOne = envelopeService.createEnvelope(sideA, sideB);

                ConsoleHelper.print("Enter sideA for second envelope...");
                double sideC = Utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                ConsoleHelper.print("Enter sideB for second envelope...");
                double sideD = Utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                envelopeTwo = envelopeService.createEnvelope(sideC, sideD);
                ConsoleHelper.print(envelopeService.compareEnvelopes(envelopeOne, envelopeTwo));
            } catch (AppException e) {
                ConsoleHelper.print("Exception:\n" + e);
            }
        } while (isRun());

    }

    private boolean isRun() {
        System.out.println("Do you want to continue...?\n\"y\"/\"yes\"\n");
        String answer = ConsoleHelper.getDataFromConsole().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }
}
