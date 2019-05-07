package task1;

public class ChessDesk {
    private final int width;
    private final int height;

    public ChessDesk(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChessDesk)) return false;

        ChessDesk chessDesk = (ChessDesk) o;

        if (getWidth() != chessDesk.getWidth()) return false;
        return getHeight() == chessDesk.getHeight();

    }

    @Override
    public int hashCode() {
        int result = getWidth();
        result = 31 * result + getHeight();
        return result;
    }
}
