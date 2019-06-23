package com.simonfong.myapplication.commandpattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/23.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        LogUtil.e("Stock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        LogUtil.e("Stock [ Name: " + name + ",Quantity: " + quantity + " ] sold");
    }
}
