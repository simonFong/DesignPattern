package com.simonfong.myapplication.builderpattern.food;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }


}
