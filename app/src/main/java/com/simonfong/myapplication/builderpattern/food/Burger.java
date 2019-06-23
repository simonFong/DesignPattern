package com.simonfong.myapplication.builderpattern.food;

import com.simonfong.myapplication.builderpattern.base.Item;
import com.simonfong.myapplication.builderpattern.base.Packing;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
