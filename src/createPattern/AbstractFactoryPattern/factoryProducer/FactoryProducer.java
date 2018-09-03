package createPattern.AbstractFactoryPattern.factoryProducer;

import com.sun.org.apache.regexp.internal.RE;
import createPattern.AbstractFactoryPattern.abstractFactory.AbstractFactory;
import createPattern.AbstractFactoryPattern.abstractFactory.ColorFactory;
import createPattern.AbstractFactoryPattern.abstractFactory.ShapeFactory;

/**
 * @author zxf
 * @date 2018/9/3 15:24
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
