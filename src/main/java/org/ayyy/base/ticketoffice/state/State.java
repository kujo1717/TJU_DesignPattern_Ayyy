/**
 * Copyright (C), 2022-12-07
 * FileName: Sate
 * Author:   Lv
 * Date:     2022/12/7 22:51
 * Description: 门票状态接口
 */
package org.ayyy.base.ticketoffice.state;

public interface State {
    void show(TicketState ticketState);
}
