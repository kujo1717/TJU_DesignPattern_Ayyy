/**
 * Copyright (C), 2022-12-07
 * FileName: UnpurchasedState
 * Author:   Lv
 * Date:     2022/12/7 23:00
 * Description: 未购买状态
 */
package org.ayyy.base.ticketoffice.state;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class UnpurchasedState implements State {

    @Override
    public void show(TicketState ticketState){
        String msg = "门票状态：未购买";
        System.out.println(msg);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "UnpurchasedState",
                        "show",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }

}
