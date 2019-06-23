package com.simonfong.myapplication.abstractfactorypattern.factory;

import com.simonfong.myapplication.abstractfactorypattern.colorimpl.Color;
import com.simonfong.myapplication.factorypattern.impl.Shape;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
