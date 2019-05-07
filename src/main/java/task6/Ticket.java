package task6;

public class Ticket {
    private static final int TYPE = 6;
    private int[] ticket;
    private int number;

    public Ticket(int number) {
        this.ticket = new int[TYPE];
        this.number = number;
    }

    public void setTicket() {
        String digits = Integer.toString(number);
        char[] charArray = digits.toCharArray();
        for (int i = ticket.length - 1, j = charArray.length - 1; j >= 0; j--, i--) {
            int digit = Character.getNumericValue(charArray[j]);
            ticket[i] = digit;
        }
    }

    public int[] getTicket() {
        return ticket;
    }
}
