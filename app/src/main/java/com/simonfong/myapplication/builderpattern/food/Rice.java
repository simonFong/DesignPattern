package com.simonfong.myapplication.builderpattern.food;

import com.simonfong.myapplication.builderpattern.base.Item;
import com.simonfong.myapplication.builderpattern.base.Packing;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Rice implements Item {
    @Override
    public String name() {
        return "rice";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
