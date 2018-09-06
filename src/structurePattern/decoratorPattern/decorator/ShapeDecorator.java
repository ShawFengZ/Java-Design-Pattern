package structurePattern.decoratorPattern.decorator;

import structurePattern.decoratorPattern.entity.Shape;

/**
 * @author zxf
 * @date 2018/9/6 9:29
 */
//步骤3：创建实现了 Shape 接口的抽象装饰类。
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
