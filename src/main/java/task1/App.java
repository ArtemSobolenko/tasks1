package task1;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class App {

    private static final ChessDeskService chessDeskService = new ChessDeskService();
    private static final Validator validator = new Validator();

    private static final int indexForParamOne = 0;
    private static final int indexForParamTwo = 1;

    public static void main(String[] args) {

        if (validator.isValidNumberOfArguments(args)) {
            try {
                int width = Utils.getIntegerFromParam(args[indexForParamOne]);
                int height = Utils.getIntegerFromParam(args[indexForParamTwo]);
                ChessDesk chessDesk = chessDeskService.createChessDesk(width, height);
                ConsoleHelper.print(chessDeskService.getChessDeskLikeString(chessDesk));
            } catch (AppException e) {
                ConsoleHelper.print("The parameter must be an integer and greater than zero!\n" + e);
            }
        } else {
            ConsoleHelper.print("You need run the application with two parameters: 1 - width, 2 - height." +
                    "\nAnd they must be positive integers.");
        }
    }
}
