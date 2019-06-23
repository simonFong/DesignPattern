package com.simonfong.myapplication.abstractfactorypattern.factory;

import com.simonfong.myapplication.abstractfactorypattern.colorimpl.Blue;
import com.simonfong.myapplication.abstractfactorypattern.colorimpl.Color;
import com.simonfong.myapplication.abstractfactorypattern.colorimpl.Green;
import com.simonfong.myapplication.abstractfactorypattern.colorimpl.Red;
import com.simonfong.myapplication.factorypattern.impl.Shape;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
