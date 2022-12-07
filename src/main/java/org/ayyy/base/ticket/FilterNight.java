package org.ayyy.base.ticket;

import java.util.ArrayList;
import java.util.List;

public class FilterNight implements Fliter{
    @Override
    public List<Ticket> fliterTickets(List<Ticket> tickets){
        List<Ticket> nightTickets=new ArrayList<Ticket>();
        for(Ticket ticket:tickets){
            if (ticket.getTime().equals("夜间")){
                nightTickets.add(ticket);
            }
        }
        return nightTickets;
    }
}
