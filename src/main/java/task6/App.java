package task6;

import console.ConsoleHelper;

public class App {

    public static void main(String[] args) {

        int ticketNumber;

        for (int i = 999_999; i <= 999_999; i++) {
            ticketNumber = i;

            Ticket ticket = new Ticket(ticketNumber);
            ticket.setTicket();

            LuckyTicketCounter luckyTicketCounter = new LuckyTicketCounter(ticket);
            if (luckyTicketCounter.getMoskovStyle()){
                ConsoleHelper.print("Moskov style: Lucky - " + ticketNumber);
            }else {
                ConsoleHelper.print("Moskov style: Unlucky - " + ticketNumber);
            }
            if (luckyTicketCounter.getPiterStyle()){
                ConsoleHelper.print("Piter style: Lucky - " + ticketNumber);
            }else {
                ConsoleHelper.print("Piter style: Unlucky - " + ticketNumber);
            }
        }

    }
}
