package task1;

public class ChessDeskService {

    public String getChessDeskLikeString(ChessDesk chessDesk) {
        StringBuilder chessDeskString = new StringBuilder();
        char black = '■';
        char white = '□';
        for (int i = 0; i < chessDesk.getHeight(); i++) {
            for (int j = 0; j < chessDesk.getWidth(); j++) {
                if ((j + i) % 2 == 0) {
                    chessDeskString.append(black);
                } else {
                    chessDeskString.append(white);
                }
            }
            chessDeskString.append('\n');
        }
        return chessDeskString.toString();
    }

    public ChessDesk createChessDesk(int width, int height) {
        return new ChessDesk(width, height);
    }
}
