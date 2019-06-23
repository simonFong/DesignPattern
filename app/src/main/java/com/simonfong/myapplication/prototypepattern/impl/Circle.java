package com.simonfong.myapplication.prototypepattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        LogUtil.e("Inside Circle::draw() method.");
    }
}
