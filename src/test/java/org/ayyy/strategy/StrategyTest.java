/**
 * Copyright (C), 2022-12-07
 * FileName: StrategyTest
 * Author:   Lv
 * Date:     2022/12/7 23:27
 * Description: 策略模式测试
 */
package org.ayyy.strategy;



import org.ayyy.base.ticketoffice.strategy.FamilyTicket;
import org.ayyy.base.ticketoffice.strategy.LoversTicket;
import org.ayyy.base.ticketoffice.strategy.TeamTicket;
import org.ayyy.base.ticketoffice.strategy.UserStrategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @BeforeEach
    void start(){
        System.out.println("策略模式测试开始...");
    }

    @Test
    void testStrategy() {
        UserStrategy userStrategy = new UserStrategy();

        System.out.println("情侣A、B...");
        LoversTicket loversTicket = new LoversTicket();
        loversTicket.buy("情侣A、B");

        System.out.println("夫妻C、D和孩子E...");
        FamilyTicket familyTicket = new FamilyTicket();
        familyTicket.buy("夫妻C、D和孩子E");

        System.out.println("好友F、G、H、K...");
        TeamTicket teamTicket = new TeamTicket();
        teamTicket.buy("好友F、G、H、K");

    }

    @AfterEach
    void end(){
        System.out.println("策略模式测试结束！");
    }
}
