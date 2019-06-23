package com.simonfong.myapplication.builderpattern.food;

import com.simonfong.myapplication.builderpattern.base.Packing;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
