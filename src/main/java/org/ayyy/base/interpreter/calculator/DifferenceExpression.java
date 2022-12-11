package org.ayyy.base.interpreter.calculator;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:文法：分析不同收入来源
 */
public class DifferenceExpression implements Expression {
    @Override
    public void interpret(float ticketMoney, float shopMoney, float expenseMoney) {
        //判断哪种收入高
        String higher = null;
        String lower = null;
        if(ticketMoney > shopMoney) {
            higher = "门票收入";
            lower = "纪念品商店收入";
        }
        else if(ticketMoney < shopMoney) {
            higher = "纪念品商店收入";
            lower = "门票收入";
        }
        else {
            higher = null;
            lower = null;
        }

        //收入差值
        float delta = Math.abs(ticketMoney - shopMoney);

        //打印信息
        String msg = higher != null && lower != null ? higher+"比"+lower+"高了"+delta+"元" : "门票收入与纪念品商店收入均为"+higher;

        CallStackLogger.log(
                new CallStackLogInfo(
                        "DifferenceExpression",
                        "interpret",
                        String.valueOf(System.identityHashCode(this)),
                        msg)
        );
    }
}
