package org.ayyy.base.ticket;

import java.util.ArrayList;
import java.util.List;

public class FliterChildren implements Fliter{
    @Override
    public List<Ticket> fliterTickets(List<Ticket> tickets){
        List<Ticket> childrenTickets=new ArrayList<Ticket>();
        for(Ticket ticket:tickets){
            if (ticket.getType().equals("儿童")){
                childrenTickets.add(ticket);
            }
        }
        return childrenTickets;
    }
}
