package createPattern.factoryPattern.impl;

import createPattern.factoryPattern.shapeInterface.Shape;

/**
 * @author zxf
 * @date 2018/9/3 10:21
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
