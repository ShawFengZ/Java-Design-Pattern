package structurePattern.decoratorPattern.entity.impl;

import structurePattern.decoratorPattern.entity.Shape;

/**
 * @author zxf
 * @date 2018/9/6 9:27
 */
//步骤2. 创建实现接口的实体类。
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
