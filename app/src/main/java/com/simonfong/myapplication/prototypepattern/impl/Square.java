package com.simonfong.myapplication.prototypepattern.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        LogUtil.e("Inside Square::draw() method.");
    }
}
