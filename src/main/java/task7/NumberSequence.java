package task7;

public class NumberSequence {
    private int number;
    private int pow;

    public NumberSequence(int pow) {
        this.number = 0;
        this.pow = pow;
    }

    public String getSequence() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; (number = i * i) <= pow; i++) {
            stringBuilder.append(number).append(",");
        }
        return stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString();
    }
}
