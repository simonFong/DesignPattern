package com.simonfong.myapplication.decorator.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        LogUtil.e("Shape: Circle");
    }
}
