package task9;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class App {
    public static void main(String[] args) {
        int number;
        int degree;
        try {
            ConsoleHelper.print("Enter a number: ... ");
            number = Utils.getIntegerFromParam(ConsoleHelper.getDataFromConsole());
            ConsoleHelper.print("Enter a degree: ... ");
            degree = Utils.getIntegerFromParam(ConsoleHelper.getDataFromConsole());
            int result = FastPow.binaryFastPow(number,degree);
            ConsoleHelper.print("Res is: " + result);
        } catch (AppException e) {
            ConsoleHelper.print("Exception: " + e);
        }
    }
}
