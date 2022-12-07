/**
 * Copyright (C), 2022-12-07
 * FileName: ProxyTest
 * Author:   Lv
 * Date:     2022/12/7 21:22
 * Description: 代理模式的测试
 */
package org.ayyy.proxy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ayyy.base.ticketoffice.proxy.Visitor;
import org.ayyy.base.ticketoffice.proxy.Principal;
import org.ayyy.base.ticketoffice.proxy.Conductor;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ProxyTest {
    @BeforeEach
    void start(){
        System.out.println("代理模式测试开始...");
    }

    @Test
    public void testProxy(){
        Principal visitor = new Visitor("购买一张门票");
        Principal conductor = new Conductor("使用机器导出一张门票");

        //执行任务
        visitor.buyTickets();
        System.out.println("请售票员协助");
        conductor.buyTickets();
    }

    @AfterEach
    void end(){
        System.out.println("代理模式测试结束！");
    }
}
