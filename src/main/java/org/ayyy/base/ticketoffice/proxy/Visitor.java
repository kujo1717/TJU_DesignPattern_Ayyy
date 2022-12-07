/**
 * Copyright (C), 2022-12-07
 * FileName: Visitor
 * Author:   Lv
 * Date:     2022/12/7 21:34
 * Description: 游客类（购票需求方）
 */
package org.ayyy.base.ticketoffice.proxy;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

public class Visitor implements Principal {
    private String task;

    public Visitor(String work){
        this.task = work;
        requireTickets(work);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Visitor",
                        "init",
                        String.valueOf(System.identityHashCode(this)),
                        "开始帮助游戏进行机器购票的操作"
                )
        );
    }

    @Override
    public void buyTickets(){
        System.out.println("执行请求：" + task);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Visitor",
                        "buyTickets",
                        String.valueOf(System.identityHashCode(this)),
                        "帮助游客进行购票"
                )
        );
    }

    private void requireTickets(String work) {
        System.out.println("发出请求：" + work);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Visitor",
                        "requireTickets",
                        String.valueOf(System.identityHashCode(this)),
                        "游客提出购票需求"
                )
        );
    }
}
