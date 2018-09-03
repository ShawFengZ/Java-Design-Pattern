package createPattern.factoryPattern.factory;

import createPattern.factoryPattern.impl.Circle;
import createPattern.factoryPattern.impl.Rectangle;
import createPattern.factoryPattern.impl.Square;
import createPattern.factoryPattern.shapeInterface.Shape;

/**
 * @author zxf
 * @date 2018/9/3 10:24
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
