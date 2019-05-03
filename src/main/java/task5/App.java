package task5;

import console.ConsoleHelper;

public class App {

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int number = Integer.parseInt(args[0]);
                NumberToWorld numberToWorld = new NumberToWorld(number, new StringBuilder());
                ConsoleHelper.print(numberToWorld.getNumberLikeString());
            } catch (NumberFormatException e) {
                ConsoleHelper.print("The parameter must be an integer!");
            }
        } else {
            ConsoleHelper.print("You need run the application with one parameter" +
                    "\nAnd it must be an integers.");
        }

    }
}
