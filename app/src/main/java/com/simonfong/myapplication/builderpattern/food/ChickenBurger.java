package com.simonfong.myapplication.builderpattern.food;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
