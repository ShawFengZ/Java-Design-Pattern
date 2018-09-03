package createPattern.AbstractFactoryPattern.abstractFactory;

import createPattern.AbstractFactoryPattern.colorInterface.Color;
import createPattern.factoryPattern.shapeInterface.Shape;

/**
 * @author zxf
 * @date 2018/9/3 15:09
 */
//创建抽象类来获取工厂
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
