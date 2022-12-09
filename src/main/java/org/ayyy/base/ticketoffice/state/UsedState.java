/**
 * Copyright (C), 2022-12-07
 * FileName: UsedState
 * Author:   Lv
 * Date:     2022/12/7 23:04
 * Description: 已使用状态
 */
package org.ayyy.base.ticketoffice.state;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class UsedState implements State {
    @Override
    public void show(TicketState ticketState){
        String msg = "门票状态：已使用";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "UsedState",
                        "show",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}
