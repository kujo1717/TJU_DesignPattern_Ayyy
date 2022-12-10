package org.ayyy.base.stock.command;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description: 物品实体类
 */
public class Stock {
    private String name;
    private int num;

    public Stock(String name, int num) {
        this.name = name;
        this.num = num;
    }

    /**
     * @description:入库
     * @author: 黄彦铭
     * @date: 2022/12/6 14:39
     **/
    public void buy(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Stock",
                        "buy",
                        String.valueOf(System.identityHashCode(this)),
                        this.name+"买进了"+this.num+"的库存"
                )
        );
    }

    /**
     * @description:出库
     * @author: 黄彦铭
     * @date: 2022/12/6 14:39
     **/
    public void sell(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Stock",
                        "sell",
                        String.valueOf(System.identityHashCode(this)),
                        this.name+"卖出了"+this.num+"的库存"
                )
        );
    }
}
