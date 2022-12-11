package org.ayyy.base.ticket;

import lombok.Data;

@Data
public class Ticket {
    private String name;
    private String type;
    private String time;
    public Ticket(String name,String type,String time){
        this.name=name;
        this.type=type;
        this.time=time;
    }
}
