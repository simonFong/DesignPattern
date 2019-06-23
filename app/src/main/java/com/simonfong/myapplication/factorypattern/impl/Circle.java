package com.simonfong.myapplication.factorypattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        LogUtil.e("Inside Circle::draw() method.");
    }
}
