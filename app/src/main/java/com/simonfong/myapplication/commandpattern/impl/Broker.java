package com.simonfong.myapplication.commandpattern.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class Broker {
    private List<Order> mOrderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        mOrderList.add(order);
    }

    public void placeOrders() {
        for (Order order : mOrderList) {
            order.execute();
        }
        mOrderList.clear();
    }
}
