package com.simonfong.myapplication.bridge.impl;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public abstract class Shape {
    protected DrawAPI mDrawAPI;

    protected Shape(DrawAPI drawAPI) {
        mDrawAPI = drawAPI;
    }

    public abstract void draw();
}
