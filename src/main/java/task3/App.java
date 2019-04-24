package task3;

import utils.Utils;

public class App {

    private static final Utils utils = new Utils();
    private static final TriangleService triangleService = new TriangleService();
    private static final TriangleValidator triangleValidator = new TriangleValidator();

    public static void main(String[] args) {
        Menu menu = new Menu(utils, triangleService, triangleValidator);
        menu.show();
    }
}
