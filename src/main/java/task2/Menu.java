package task2;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class Menu {

    private Utils utils;
    private EnvelopeService envelopeService;

    public Menu(Utils utils, EnvelopeService envelopeService) {
        this.utils = utils;
        this.envelopeService = envelopeService;
    }

    public void show() {
        Envelope envelopeOne;
        Envelope envelopeTwo;
        do {
            try {
                ConsoleHelper.print("Enter sideA for first envelope...");
                double sideA = utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                ConsoleHelper.print("Enter sideB for first envelope...");
                double sideB = utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                envelopeOne = envelopeService.createEnvelope(sideA, sideB);

                ConsoleHelper.print("Enter sideA for second envelope...");
                double sideC = utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                ConsoleHelper.print("Enter sideB for second envelope...");
                double sideD = utils.getDoubleFromParam(ConsoleHelper.getDataFromConsole());
                envelopeTwo = envelopeService.createEnvelope(sideC, sideD);
                envelopeService.compareEnvelopes(envelopeOne, envelopeTwo);
            } catch (AppException e) {
                e.printStackTrace();
            }
        } while (isRun());

    }

    private boolean isRun() {
        System.out.println("Do you want to continue...?\n\"y\"/\"yes\"\n");
        String answer = ConsoleHelper.getDataFromConsole().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }
}
