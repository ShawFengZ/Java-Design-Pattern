package structurePattern.FacadePattern.facade;

import structurePattern.FacadePattern.entity.Shape;
import structurePattern.FacadePattern.entity.impl.Circle;
import structurePattern.FacadePattern.entity.impl.Rectangle;
import structurePattern.FacadePattern.entity.impl.Square;

/**
 * @author zxf
 * @date 2018/9/6 13:06
 */
//3. 创建一个外观类,这个类负责和Shape这个系统的交互
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
