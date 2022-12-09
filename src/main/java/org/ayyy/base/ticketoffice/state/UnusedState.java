/**
 * Copyright (C), 2022-12-07
 * FileName: UnusedState
 * Author:   Lv
 * Date:     2022/12/7 23:03
 * Description: 未使用状态
 */
package org.ayyy.base.ticketoffice.state;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class UnusedState implements State{
    @Override
    public void show(TicketState ticketState){
        String msg = "门票状态：未使用";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "UnusedState",
                        "show",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}
