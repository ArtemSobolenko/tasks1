package task7;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class App {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int pow = Utils.getIntegerFromParam(args[0]);
                NumberSequence numberSequence = new NumberSequence(pow);
                ConsoleHelper.print(numberSequence.getSequence());
            } catch (AppException e) {
                ConsoleHelper.print("Exception: " + e);
            }
        } else {
            ConsoleHelper.print("You need run the application with one parameters." +
                    "\nAnd it must be positive integers.");
        }
    }
}
