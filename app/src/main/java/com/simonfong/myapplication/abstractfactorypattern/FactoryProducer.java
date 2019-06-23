package com.simonfong.myapplication.abstractfactorypattern;

import com.simonfong.myapplication.abstractfactorypattern.factory.AbstractFactory;
import com.simonfong.myapplication.abstractfactorypattern.factory.ColorFactory;
import com.simonfong.myapplication.abstractfactorypattern.factory.ShapeFactory;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
