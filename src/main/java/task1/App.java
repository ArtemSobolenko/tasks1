package task1;

import console.ConsoleHelper;
import exception.AppException;
import utils.Utils;

public class App {

    private static final ChessDeskService chessDeskService = new ChessDeskService();
    private static final Validator validator = new Validator();
    private static final Utils utils = new Utils();

    private static final int paramOne = 0;
    private static final int paramTwo = 1;

    public static void main(String[] args) {

        if (!validator.isValidNumberOfArguments(args)) {
            ConsoleHelper.print("You need run the application with two parameters: 1 - width, 2 - height." +
                    "\nAnd they must be positive integers.");
        } else {
            try {
                ChessDesk chessDesk = chessDeskService.createChessDesk(utils.getIntegerFromParam(args[paramOne]),
                        utils.getIntegerFromParam(args[paramTwo]));
                ConsoleHelper.print(chessDeskService.getChessDeskLikeString(chessDesk));
            } catch (AppException e) {
                e.printStackTrace();
            }
        }
    }
}
