/**
 * Copyright (C), 2022-12-07
 * FileName: UserStrategy
 * Author:   Lv
 * Date:     2022/12/7 23:35
 * Description: 游客可选策略类
 */
package org.ayyy.base.ticketoffice.strategy;


public class UserStrategy {
    private TicketStrategy strategy;

    public UserStrategy(){
        strategy=null;
    }

    /**
     * 设置购票策略
     * @param strategy 目标策略*/
    public void setStrategy(TicketStrategy strategy){
        this.strategy = strategy;
    }

    /**
     * 获取当前的购票策略
     * @return 目标策略*/
    public TicketStrategy getStrategy(){
        return strategy;
    }
}
