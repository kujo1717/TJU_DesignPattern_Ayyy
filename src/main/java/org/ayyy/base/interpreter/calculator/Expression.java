package org.ayyy.base.interpreter.calculator;

/**
 * @description: 文法抽象接口
 * @author: 黄彦铭
 * @date: 2022/12/6 16:40
 * @param: 门票收入，商店收入，博物馆支出
 **/
public interface Expression {
    void interpret(float ticketMoney, float shopMoney, float expenseMoney);
}
