package org.ayyy.interpreter;

import org.ayyy.base.interpreter.calculator.DifferenceExpression;
import org.ayyy.base.interpreter.calculator.NoticeExpression;
import org.ayyy.base.interpreter.calculator.SumExpression;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/04
 * @Description: 命令模式测试
 */
public class InterpreterTest {
    @BeforeEach
    void setUp(){
        System.out.println("VisitorTest up");
    }

    @Test
    public void testVisitor() {
        //收入
        float ticketMoney = 1000f;
        float shopMoney = 500f;

        //支出
        float expenseMoney = 700f;

        //不同解释器测试
        new NoticeExpression().interpret(ticketMoney,shopMoney,expenseMoney);
        new SumExpression().interpret(ticketMoney,shopMoney,expenseMoney);
        new DifferenceExpression().interpret(ticketMoney,shopMoney,expenseMoney);
    }

    @AfterEach
    void end(){
        System.out.println("VisitorTest done");
    }
}
