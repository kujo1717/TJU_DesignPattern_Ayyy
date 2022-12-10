package org.ayyy.command;


import org.ayyy.base.stock.command.CommandBuy;
import org.ayyy.base.stock.command.CommandSell;
import org.ayyy.base.stock.command.Staff;
import org.ayyy.base.stock.command.Stock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/04
 * @Description: 命令模式测试
 */
public class CommandTest {
    @BeforeEach
    void setUp(){
        System.out.println("CommandTest up");
    }

    @Test
    void testCommand(){
        Stock stock = new Stock("纪念品商店",10);

        CommandBuy buyStockOrder = new CommandBuy(stock);
        CommandSell sellStockOrder = new CommandSell(stock);

        Staff staff = new Staff();
        staff.takeOrder(buyStockOrder);
        staff.takeOrder(sellStockOrder);

        staff.placeOrders();
    }

    @AfterEach
    void end(){
        System.out.println("CommandTest done");
    }
}
