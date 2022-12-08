/**
 * Copyright (C), 2022-12-07
 * FileName: FamilyTicket
 * Author:   Lv
 * Date:     2022/12/7 23:22
 * Description: 家庭票类
 */
package org.ayyy.base.ticketoffice.strategy;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class FamilyTicket implements TicketStrategy{
    @Override
    public void buy(String visitorName){
        String msg = visitorName + "购买了家庭票";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "FamilyTicket",
                        "buy",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}
