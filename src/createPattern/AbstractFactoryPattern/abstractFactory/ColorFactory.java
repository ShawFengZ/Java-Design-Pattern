package createPattern.AbstractFactoryPattern.abstractFactory;

import createPattern.AbstractFactoryPattern.colorInterface.Color;
import createPattern.AbstractFactoryPattern.implColor.Blue;
import createPattern.AbstractFactoryPattern.implColor.Green;
import createPattern.AbstractFactoryPattern.implColor.Red;
import createPattern.factoryPattern.shapeInterface.Shape;

import javax.swing.plaf.synth.ColorType;

/**
 * @author zxf
 * @date 2018/9/3 15:21
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        if (colorType == null)
            return null;
        if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("Blue")){
            return new Blue();
        }else if (colorType.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
