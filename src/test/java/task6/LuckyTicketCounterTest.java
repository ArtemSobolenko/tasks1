package task6;

import org.junit.Assert;
import org.junit.Test;

public class LuckyTicketCounterTest {

    @Test
    public void getMoskovStyleLuckyTest() {
        Ticket ticket = new Ticket(268736);
        ticket.setTicket();
        LuckyTicketCounter luckyTicketCounter = new LuckyTicketCounter(ticket);
        Assert.assertTrue(luckyTicketCounter.getMoskovStyle());
    }

    @Test
    public void getMoskovStyleUnluckyTest() {
        Ticket ticket = new Ticket(268737);
        ticket.setTicket();
        LuckyTicketCounter luckyTicketCounter = new LuckyTicketCounter(ticket);
        Assert.assertFalse(luckyTicketCounter.getMoskovStyle());
    }

    @Test
    public void getPiterStyleLuckyTest() {
        Ticket ticket = new Ticket(978736);
        ticket.setTicket();
        LuckyTicketCounter luckyTicketCounter = new LuckyTicketCounter(ticket);
        Assert.assertTrue(luckyTicketCounter.getPiterStyle());
    }

    @Test
    public void getPiterStyleUnluckyTest() {
        Ticket ticket = new Ticket(968736);
        ticket.setTicket();
        LuckyTicketCounter luckyTicketCounter = new LuckyTicketCounter(ticket);
        Assert.assertFalse(luckyTicketCounter.getPiterStyle());
    }
}