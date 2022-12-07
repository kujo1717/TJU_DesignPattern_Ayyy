package org.ayyy.base.ticket;

import java.util.List;

public class AndFliter implements Fliter{
    private Fliter fliter;
    private Fliter otherFliter;

    public AndFliter(Fliter fliter, Fliter otherFliter) {
        this.fliter = fliter;
        this.otherFliter = otherFliter;
    }

    @Override
    public List<Ticket> fliterTickets(List<Ticket> tickets) {
        List<Ticket> firstFliterTickets = fliter.fliterTickets(tickets);
        return otherFliter.fliterTickets(firstFliterTickets);
    }
}
