/**
 * Copyright (C), 2022-12-07
 * FileName: InvalidState
 * Author:   Lv
 * Date:     2022/12/7 23:05
 * Description: 失效状态
 */
package org.ayyy.base.ticketoffice.state;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class InvalidState implements State {
    @Override
    public void show(TicketState ticketState){
        String msg = "门票状态：已失效";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "InvalidState",
                        "show",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}
