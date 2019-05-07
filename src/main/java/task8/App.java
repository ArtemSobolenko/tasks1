package task8;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class App {

    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                int start = Utils.getIntegerFromParam(args[0]);
                int end = Utils.getIntegerFromParam(args[1]);
                if (start >= end) {
                    throw new AppException("Second parameter must be greater than first parameter!");
                }
                String fibonacciSequence = Fibonacci.getFibonacciSequence(start, end);
                ConsoleHelper.print(fibonacciSequence);
            } catch (AppException e) {
                ConsoleHelper.print("Exception: " + e);
            }

        } else {
            ConsoleHelper.print("You need run the application with two parameters: 1 - start range of fibonacci, " +
                    "2 - end range of fibonacci." +
                    "\nAnd they must be positive integers.");
        }
    }
}
