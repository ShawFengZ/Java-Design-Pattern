package structurePattern.FacadePattern.entity.impl;

import structurePattern.FacadePattern.entity.Shape;

/**
 * @author zxf
 * @date 2018/9/6 13:05
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
