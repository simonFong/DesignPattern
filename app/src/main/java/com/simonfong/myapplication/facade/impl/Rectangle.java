package com.simonfong.myapplication.facade.impl;

import com.simonfong.myapplication.util.LogUtil;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        LogUtil.e("Rectangle::draw()");
    }
}
