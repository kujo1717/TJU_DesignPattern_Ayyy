package org.ayyy.fliter;

import org.ayyy.base.ticket.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FliterTest {
    @Test
    void test(){
        List<Ticket> tickets=new ArrayList<Ticket>();
        tickets.add(new Ticket("小朋友1","儿童","全天"));
        tickets.add(new Ticket("成人1","成人","全天"));
        tickets.add(new Ticket("成人2","成人","全天"));
        tickets.add(new Ticket("小朋友2","儿童","夜间"));
        tickets.add(new Ticket("小朋友3","儿童","全天"));
        tickets.add(new Ticket("成人3","成人","夜间"));
        tickets.add(new Ticket("成人4","成人","全天"));
        tickets.add(new Ticket("小朋友4","儿童","夜间"));
        tickets.add(new Ticket("小朋友5","儿童","夜间"));
        tickets.add(new Ticket("成人5","成人","夜间"));
        tickets.add(new Ticket("小朋友6","儿童","全天"));
        tickets.add(new Ticket("成人6","成人","全天"));
        tickets.add(new Ticket("成人7","成人","夜间"));
        Fliter adult=new FliterAdult();
        Fliter children=new FliterChildren();
        Fliter night=new FilterNight();
        Fliter nightAdult=new AndFliter(adult,night);
        Fliter childrenOrNight=new OrFliter(children,night);
        System.out.println("成人");
        printTickets(adult.fliterTickets(tickets));
        System.out.println("儿童");
        printTickets(children.fliterTickets(tickets));
        System.out.println("成人夜间票");
        printTickets(nightAdult.fliterTickets(tickets));
        System.out.println("非全价票");
        printTickets(childrenOrNight.fliterTickets(tickets));

    }
    public static void printTickets(List<Ticket> tickets){
        for (Ticket ticket:tickets){
            System.out.println("Ticket : [名字:"+ticket.getName()+",类型:"+ ticket.getType()+",时间:"+ticket.getTime()+"]");
        }
    }
}
