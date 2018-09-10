package structurePattern.flyweightPattern.factory;

import structurePattern.flyweightPattern.entity.Shape;
import structurePattern.flyweightPattern.entity.impl.Circle;

import java.util.HashMap;

/**
 * @author zxf
 * @date 2018/9/10 9:06
 */
//步骤3：创建一个工厂，生成基于给定信息的实体类的对象
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }

        return circle;
    }
}
