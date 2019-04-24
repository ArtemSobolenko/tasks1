package task2;

import utils.Utils;

public class App {

    private static final Utils utils = new Utils();
    private static final EnvelopeService envelopeService = new EnvelopeService();

    public static void main(String[] args) {
        Menu menu = new Menu(utils, envelopeService);
        menu.show();
    }
}
