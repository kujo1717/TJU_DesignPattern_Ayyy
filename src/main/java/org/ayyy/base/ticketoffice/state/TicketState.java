/**
 * Copyright (C), 2022-12-07
 * FileName: TicketState
 * Author:   Lv
 * Date:     2022/12/7 22:50
 * Description: 门票状态类
 */
package org.ayyy.base.ticketoffice.state;

public class TicketState {
    private State state;

    public TicketState(){
        state=null;
    }

    /**
    * 设置门票的使用状态
    * @param state 目标状态*/
    public void setState(State state){
        this.state = state;
    }

    /**
     * 获取门票当前的使用状态
     * @return 目标状态*/
    public State getState(){
        return state;
    }
}
