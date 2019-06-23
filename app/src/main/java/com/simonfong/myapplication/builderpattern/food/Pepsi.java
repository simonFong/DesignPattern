package com.simonfong.myapplication.builderpattern.food;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
