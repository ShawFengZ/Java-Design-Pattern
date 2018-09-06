package structurePattern.FacadePattern.entity.impl;

import structurePattern.FacadePattern.entity.Shape;

/**
 * @author zxf
 * @date 2018/9/6 13:04
 */
//2. 创建接口的实体类
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
