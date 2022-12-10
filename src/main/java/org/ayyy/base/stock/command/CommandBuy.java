package org.ayyy.base.stock.command;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:入库命令
 */
public class CommandBuy implements ICommand {
    private Stock stock;

    public CommandBuy(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
