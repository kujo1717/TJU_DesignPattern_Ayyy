/**
 * Copyright (C), 2022-12-07
 * FileName: StateTest
 * Author:   Lv
 * Date:     2022/12/7 23:09
 * Description: 状态模式测试
 */
package org.ayyy.state;



import org.ayyy.base.ticketoffice.state.TicketState;
import org.ayyy.base.ticketoffice.state.InvalidState;
import org.ayyy.base.ticketoffice.state.UnpurchasedState;
import org.ayyy.base.ticketoffice.state.UnusedState;
import org.ayyy.base.ticketoffice.state.UsedState;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class StateTest {
    @BeforeEach
    void start(){
        System.out.println("状态模式测试开始...");
    }

    @Test
    void testState(){
        TicketState ticketState = new TicketState();

        System.out.println("开始售票...");
        UnpurchasedState unpurchasedState = new UnpurchasedState();
        unpurchasedState.show(ticketState);
        System.out.println("游客买票...");
        UnusedState unusedState = new UnusedState();
        unusedState.show(ticketState);
        System.out.println("游客入馆...");
        UsedState usedState = new UsedState();
        usedState.show(ticketState);
        System.out.println("超过有效时间...");
        InvalidState invalidState = new InvalidState();
        invalidState.show(ticketState);


    }

    @AfterEach
    void end(){
        System.out.println("状态模式测试结束！");
    }
}
