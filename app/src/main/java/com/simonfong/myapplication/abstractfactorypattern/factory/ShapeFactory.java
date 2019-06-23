package com.simonfong.myapplication.abstractfactorypattern.factory;

import com.simonfong.myapplication.abstractfactorypattern.colorimpl.Color;
import com.simonfong.myapplication.abstractfactorypattern.shapeimpl.Circle;
import com.simonfong.myapplication.abstractfactorypattern.shapeimpl.Rectangle;
import com.simonfong.myapplication.abstractfactorypattern.shapeimpl.Square;
import com.simonfong.myapplication.factorypattern.impl.Shape;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
