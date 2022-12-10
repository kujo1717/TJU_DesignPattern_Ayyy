package org.ayyy.base.stock.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:工作人员实体类
 */
public class Staff {
    private List<ICommand> orderList = new ArrayList<>();
    /**
     * 接收命令
     * @param order 命令
     */
    public void takeOrder(ICommand order){
        orderList.add(order);
    }
    /**
     * 执行命令
     *
     */
    public void placeOrders(){
        for (ICommand command : orderList) {
            command.execute();
        }
        orderList.clear();
    }
}
