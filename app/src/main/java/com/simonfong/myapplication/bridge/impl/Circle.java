package com.simonfong.myapplication.bridge.impl;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        mDrawAPI.drawCircle(radius, x, y);
    }
}
