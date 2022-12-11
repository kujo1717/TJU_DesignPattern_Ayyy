/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 黑板模式测试
 */
package org.ayyy.blackboard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ayyy.base.noticeboard.*;

/**
 * @author aodethri
 */
public class BlackboardTest {
    @BeforeEach
    void start(){
        System.out.println("黑板模式测试开始...");
    }

    @Test
    public void blackboardTest(){
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.addSource("今日门票优惠:八折");
        control.addSource("今日宋代瓷器展区养护，暂不开放");
        control.loop();
        blackboard.inspect();
    }

    @AfterEach
    void end(){
        System.out.println("黑板模式测试结束！");
    }
}
