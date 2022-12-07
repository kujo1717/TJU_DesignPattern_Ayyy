package org.ayyy.base.ticket;

import java.util.List;

public class OrFliter implements Fliter{
    private Fliter fliter;
    private Fliter otherFliter;

    public OrFliter(Fliter fliter, Fliter otherFliter) {
        this.fliter = fliter;
        this.otherFliter = otherFliter;
    }

    @Override
    public List<Ticket> fliterTickets(List<Ticket> tickets) {
        List<Ticket> firstFliterTickets = fliter.fliterTickets(tickets);
        List<Ticket> otherFliterTickets=otherFliter.fliterTickets(tickets);
        for (Ticket ticket:otherFliterTickets){
            if (!firstFliterTickets.contains(ticket)){
                firstFliterTickets.add(ticket);
            }
        }
        return firstFliterTickets;
    }
}
