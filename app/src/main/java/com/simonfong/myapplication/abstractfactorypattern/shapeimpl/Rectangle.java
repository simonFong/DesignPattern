package com.simonfong.myapplication.abstractfactorypattern.shapeimpl;

import com.simonfong.myapplication.factorypattern.impl.Shape;
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
        LogUtil.e( "Inside Rectangle::draw() method.");
    }
}
