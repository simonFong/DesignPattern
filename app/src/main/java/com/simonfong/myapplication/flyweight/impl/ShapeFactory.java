package com.simonfong.myapplication.flyweight.impl;

import com.simonfong.myapplication.util.LogUtil;

import java.util.HashMap;

/**
 * @author fengzimin
 * Created  on  2019/06/11.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            LogUtil.e("Creating circle of color : " + color);
        }
        return circle;
    }
}
