package org.ayyy.base.stock.command;

/**
 * @Author: 黄彦铭
 * @Date: 2022/12/06
 * @Description:出库命令
 */
public class CommandSell implements ICommand {
    private Stock stock;

    public CommandSell(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
