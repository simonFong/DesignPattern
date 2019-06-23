package com.simonfong.myapplication.builderpattern.food;

import com.simonfong.myapplication.builderpattern.base.Packing;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
