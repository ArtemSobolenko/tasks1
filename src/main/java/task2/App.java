package task2;

public class App {

    private static final EnvelopeService envelopeService = new EnvelopeService();

    public static void main(String[] args) {
        Menu menu = new Menu(envelopeService);
        menu.show();
    }
}
