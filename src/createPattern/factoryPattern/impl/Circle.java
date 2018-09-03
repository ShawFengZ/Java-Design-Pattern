package createPattern.factoryPattern.impl;

import createPattern.factoryPattern.shapeInterface.Shape;

/**
 * @author zxf
 * @date 2018/9/3 10:22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
