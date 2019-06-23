package com.simonfong.myapplication.prototypepattern;


import com.simonfong.myapplication.prototypepattern.impl.Circle;
import com.simonfong.myapplication.prototypepattern.impl.Rectangle;
import com.simonfong.myapplication.prototypepattern.impl.Shape;
import com.simonfong.myapplication.prototypepattern.impl.Square;

import java.util.Hashtable;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape)cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
