package com.simonfong.myapplication.builderpattern.food;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
