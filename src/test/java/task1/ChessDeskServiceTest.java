package task1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessDeskServiceTest {

    private ChessDesk chessDesk;
    private ChessDeskService chessDeskService;
    private int width;
    private int height;

    @Before
    public void setUp() throws Exception {
        width = 8;
        height = 8;
        chessDesk = new ChessDesk(width, height);
        chessDeskService = new ChessDeskService();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getChessDeskLikeStringTest() {
        //GIVEN
        int actualCharacters = width * height + height;
        int expectedCharacters;
        //WHEN
        expectedCharacters = chessDeskService.getChessDeskLikeString(this.chessDesk).length();
        //THEN
        Assert.assertEquals(actualCharacters, expectedCharacters);
    }

    @Test
    public void createChessDeskTest() {
        //GIVEN
        ChessDesk chessDesk;
        //WHEN
        chessDesk = chessDeskService.createChessDesk(width, height);
        //THEN
        Assert.assertEquals(chessDesk, this.chessDesk);
    }
}