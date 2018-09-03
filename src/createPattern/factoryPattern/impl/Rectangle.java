package createPattern.factoryPattern.impl;

import createPattern.factoryPattern.shapeInterface.Shape;

/**
 * @author zxf
 * @date 2018/9/3 10:20
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
