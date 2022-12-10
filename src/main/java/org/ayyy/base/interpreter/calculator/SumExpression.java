package org.ayyy.base.interpreter.calculator;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:文法：计算净收入
 */
public class SumExpression implements Expression {
    @Override
    public void interpret(float ticketMoney, float shopMoney, float expenseMoney) {
        float sum = ticketMoney + shopMoney - expenseMoney;
        String msg = sum >= 0 ? "盈利"+String.valueOf(sum)+"元" : "亏损"+String.valueOf(sum)+"元";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "SumExpression",
                        "interpret",
                        String.valueOf(System.identityHashCode(this)),
                        msg)
        );
    }
}
