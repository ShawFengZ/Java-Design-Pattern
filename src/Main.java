import createPattern.AbstractFactoryPattern.abstractFactory.AbstractFactory;
import createPattern.AbstractFactoryPattern.colorInterface.Color;
import createPattern.AbstractFactoryPattern.factoryProducer.FactoryProducer;
import createPattern.builderPattern.builder.MealBuilder;
import createPattern.builderPattern.meal.Meal;
import createPattern.factoryPattern.factory.ShapeFactory;
import createPattern.factoryPattern.shapeInterface.Shape;
import createPattern.singletonPattern.demo.SingleObject;

public class Main {

    public static void main(String[] args) {
        /**
         * 1. 通过工厂类创建对象
         * */
        /*ShapeFactory shapeFactory = new ShapeFactory();
        //获取Circle对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用Circle的draw方法
        shape1.draw();
        //获取Rectangle对象并调用其draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        //获取Square对象并调用其draw方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();*/

        /**
         * 2. 使用FactoryProducer来获取AbstractFactory，通过传递消息来获取实体类的对象
         * */
        //获取形状工厂
        /*AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //获取形状为Circle的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用circle的draw方法
        shape1.draw();
        //获取形状为Rectangle的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //调用Rectangle的draw方法
        shape2.draw();
        //获取形状为Square的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //调用SQUARE的draw方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        // 获取颜色为red的对象
        Color color1 = colorFactory.getColor("RED");
        //调用red的fill方法
        color1.fill();
        //获取颜色的Blue对象
        Color color2 = colorFactory.getColor("GREEN");
        //调用blue的fill方法
        color2.fill();
        //获取颜色Green的对象
        Color color3 = colorFactory.getColor("GREEN");
        //调用Green的fill方法
        color3.fill();*/

        /**
         * 3. 通过singleton创建唯一的对象
         * */
        //报错，因为SingleObect()构建函数是不可见的
        //SingleObject object = new SingleObject();

        /*SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();*/

        /**
         * 4. 构造者模式演示
         * */
        MealBuilder mealBuilder = new MealBuilder();
        //素菜Meal
        Meal vegMeal  = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal: ");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());
        //荤菜Meal
        Meal nonVegMean = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal: ");
        nonVegMean.showItems();
        System.out.println("Total cost: "+nonVegMean.getCost());

    }
}
