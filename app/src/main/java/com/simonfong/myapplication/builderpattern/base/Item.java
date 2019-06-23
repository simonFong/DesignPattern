package com.simonfong.myapplication.builderpattern.base;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
