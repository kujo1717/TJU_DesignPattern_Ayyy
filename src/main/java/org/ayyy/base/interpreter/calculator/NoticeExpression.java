package org.ayyy.base.interpreter.calculator;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:文法：打印所有种类的收入与支出
 */
public class NoticeExpression implements Expression {
    @Override
    public void interpret(float ticketMoney, float shopMoney, float expenseMoney) {
        String msg = "门票收入为："+ticketMoney+"，纪念品商店收入为："+shopMoney+"，总支出为："+expenseMoney;

        CallStackLogger.log(
                new CallStackLogInfo(
                        "NoticeExpression",
                        "interpret",
                        String.valueOf(System.identityHashCode(this)),
                        msg)
        );
    }
}
