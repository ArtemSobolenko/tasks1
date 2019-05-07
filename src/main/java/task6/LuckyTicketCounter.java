package task6;

public class LuckyTicketCounter {
    private Ticket ticket;

    public LuckyTicketCounter(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean getMoskovStyle() {
        int ticketNumbers[] = ticket.getTicket();
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < ticketNumbers.length / 2; i++) {
            sumFirstHalf += ticketNumbers[i];
        }

        for (int i = ticketNumbers.length / 2; i < ticketNumbers.length; i++) {
            sumSecondHalf += ticketNumbers[i];
        }

        return sumFirstHalf == sumSecondHalf;
    }

    public boolean getPiterStyle() {
        int ticketNumbers[] = ticket.getTicket();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < ticketNumbers.length; i++) {
            if (i % 2 == 0) {
                sumEven += ticketNumbers[i];
            } else {
                sumOdd += ticketNumbers[i];
            }
        }
        return sumEven == sumOdd;
    }
}
