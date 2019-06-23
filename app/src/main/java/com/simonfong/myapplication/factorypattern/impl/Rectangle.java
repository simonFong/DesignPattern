package com.simonfong.myapplication.factorypattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        LogUtil.e("Inside Rectangle::draw() method.");
    }
}
