package com.simonfong.myapplication.commandpattern.impl;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
