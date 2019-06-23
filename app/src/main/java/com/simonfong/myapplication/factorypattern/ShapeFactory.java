package com.simonfong.myapplication.factorypattern;

import com.simonfong.myapplication.factorypattern.impl.Circle;
import com.simonfong.myapplication.factorypattern.impl.Rectangle;
import com.simonfong.myapplication.factorypattern.impl.Shape;
import com.simonfong.myapplication.factorypattern.impl.Square;

/**
 * Created  on  2019/06/07.
 * interface by
 *
 * @author fengzimin
 */
public class ShapeFactory {

    private final String CIRCLE_TYPE = "CIRCLE";
    private final String RECTANGLE_TYPE = "RECTANGLE";
    private final String SQUARE_TYPE = "SQUARE";

    public enum TYPE {
        CIRCLE(), RECTANGLE(), SQUARE();
    }

    public Shape getShape(TYPE shapeType) {
        if (shapeType == TYPE.CIRCLE) {
            return new Circle();
        } else if (shapeType == TYPE.RECTANGLE) {
            return new Rectangle();
        } else if (shapeType == TYPE.SQUARE) {
            return new Square();
        }
        return null;
    }
}
