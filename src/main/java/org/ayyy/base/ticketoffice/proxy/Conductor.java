/**
 * Copyright (C), 2022-12-07
 * FileName: Conductor
 * Author:   Lv
 * Date:     2022/12/7 21:43
 * Description: 售票员类（实际购票代理者）
 */
package org.ayyy.base.ticketoffice.proxy;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class Conductor implements Principal{
    private Visitor visitor;
    private String task;


    public Conductor(String work) {
        this.task = work;
    }

    /**
     * 执行任务
     */
    @Override
    public void buyTickets() {
        if (visitor == null) {
            visitor = new Visitor(task);
        }
        visitor.buyTickets();

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Conductor",
                        "buyTickets",
                        String.valueOf(System.identityHashCode(this)),
                        "进行购票操作"
                )
        );
    }
}
