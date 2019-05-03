package task3;

public class App {

    private static final TriangleService triangleService = new TriangleService();
    private static final TriangleValidator triangleValidator = new TriangleValidator();

    public static void main(String[] args) {
        Menu menu = new Menu(triangleService, triangleValidator);
        menu.show();
    }
}
