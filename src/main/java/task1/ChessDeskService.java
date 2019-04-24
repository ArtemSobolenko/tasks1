package task1;

import java.util.ArrayList;
import java.util.List;

public class ChessDeskService {

    public String getChessDeskLikeString(ChessDesk chessDesk) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < chessDesk.getHeight(); i++) {
            for (int j = 0; j < chessDesk.getWidth(); j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        characterList.add('*');
                    } else {
                        characterList.add('_');
                    }
                } else {
                    if (j % 2 != 0) {
                        characterList.add('_');
                    } else {
                        characterList.add('*');
                    }
                }
            }
            characterList.add('\n');
        }
        char[] desk = new char[characterList.size()];

        for (int i = 0; i < desk.length; i++) {
            desk[i] = characterList.get(i);
        }
        return new String(desk);
    }

    public ChessDesk createChessDesk(int width, int height) {
        return new ChessDesk(width, height);
    }
}
