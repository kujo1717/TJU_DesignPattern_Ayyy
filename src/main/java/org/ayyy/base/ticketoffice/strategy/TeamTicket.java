/**
 * Copyright (C), 2022-12-07
 * FileName: TeamTicket
 * Author:   Lv
 * Date:     2022/12/7 23:23
 * Description: 团体票类
 */
package org.ayyy.base.ticketoffice.strategy;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class TeamTicket implements TicketStrategy{
        @Override
        public void buy(String visitorName){
        String msg = visitorName + "购买了团体票";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "TeamTicket",
                        "buy",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}
