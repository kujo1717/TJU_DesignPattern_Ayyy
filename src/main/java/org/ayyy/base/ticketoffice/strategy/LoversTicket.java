/**
 * Copyright (C), 2022-12-07
 * FileName: LoversTicket
 * Author:   Lv
 * Date:     2022/12/7 23:22
 * Description: 情侣票类
 */
package org.ayyy.base.ticketoffice.strategy;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class LoversTicket implements TicketStrategy{
    @Override
    public void buy(String visitorName){
        String msg = visitorName + "购买了情侣票";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "LoversTicket",
                        "buy",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}
