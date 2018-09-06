package structurePattern.decoratorPattern.decorator;

import structurePattern.decoratorPattern.entity.Shape;

/**
 * @author zxf
 * @date 2018/9/6 9:32
 */
//步骤4. 创建扩展了 ShapeDecorator 类的实体装饰类。
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
