package com.simonfong.myapplication.prototypepattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        LogUtil.e("Inside Rectangle::draw() method.");
    }
}
