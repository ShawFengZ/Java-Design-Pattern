package createPattern.AbstractFactoryPattern.abstractFactory;

import com.sun.org.apache.regexp.internal.RE;
import createPattern.AbstractFactoryPattern.colorInterface.Color;
import createPattern.factoryPattern.impl.Circle;
import createPattern.factoryPattern.impl.Rectangle;
import createPattern.factoryPattern.impl.Square;
import createPattern.factoryPattern.shapeInterface.Shape;

/**
 * @author zxf
 * @date 2018/9/3 15:13
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
