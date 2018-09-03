import createPattern.factoryPattern.factory.ShapeFactory;
import createPattern.factoryPattern.shapeInterface.Shape;

public class Main {

    public static void main(String[] args) {
        /**
         * 1. 通过工厂类创建对象
         * */
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取Circle对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用Circle的draw方法
        shape1.draw();
        //获取Rectangle对象并调用其draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        //获取Square对象并调用其draw方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
