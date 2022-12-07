package org.ayyy.base.ticket;

import java.util.ArrayList;
import java.util.List;

public class FliterAdult implements Fliter{
    @Override
    public List<Ticket> fliterTickets(List<Ticket> tickets){
        List<Ticket> adultTickets=new ArrayList<Ticket>();
        for(Ticket ticket:tickets){
            if (ticket.getType().equals("成人")){
                adultTickets.add(ticket);
            }
        }
        return adultTickets;
    }
}
