import behaviorPattern.StatePattern.context.Context;
import behaviorPattern.StatePattern.state.impl.StartState;
import behaviorPattern.StatePattern.state.impl.StopState;
import behaviorPattern.chainOfResponsibilityPattern.AbstractLogger;
import behaviorPattern.chainOfResponsibilityPattern.ErrorLogger;
import behaviorPattern.commandPattern.call.Broker;
import behaviorPattern.commandPattern.command.impl.BuyStock;
import behaviorPattern.commandPattern.command.impl.SellStock;
import behaviorPattern.commandPattern.request.Stock;
import behaviorPattern.interpreterPattern.expression.Expression;
import behaviorPattern.interpreterPattern.expression.impl.AndExpression;
import behaviorPattern.interpreterPattern.expression.impl.OrExpression;
import behaviorPattern.interpreterPattern.expression.impl.TerminalExpression;
import behaviorPattern.iteratorPattern.iterator.Iterator;
import behaviorPattern.iteratorPattern.iterator.impl.NameRepository;
import behaviorPattern.mediatorPattern.user.User;
import behaviorPattern.mementoPattern.CareTaker;
import behaviorPattern.mementoPattern.Originator;
import behaviorPattern.nullObjectPattern.entity.AbstractCustomer;
import behaviorPattern.nullObjectPattern.factory.CustomerFactory;
import behaviorPattern.observerPattern.BinaryObserver;
import behaviorPattern.observerPattern.HexaObserver;
import behaviorPattern.observerPattern.OctalObserver;
import behaviorPattern.observerPattern.Subject;
import behaviorPattern.strategyPattern.strategy.impl.OperationAdd;
import behaviorPattern.strategyPattern.strategy.impl.OperationMultiply;
import behaviorPattern.strategyPattern.strategy.impl.OperationSubstract;
import com.sun.org.apache.xpath.internal.operations.Or;
import createPattern.AbstractFactoryPattern.abstractFactory.AbstractFactory;
import createPattern.AbstractFactoryPattern.colorInterface.Color;
import createPattern.AbstractFactoryPattern.factoryProducer.FactoryProducer;
import createPattern.builderPattern.builder.MealBuilder;
import createPattern.builderPattern.meal.Meal;
//import createPattern.factoryPattern.factory.ShapeFactory;

//import createPattern.prototypePattern.cloneClass.Shape;
import createPattern.prototypePattern.dao.ShapeCache;
import createPattern.singletonPattern.demo.SingleObject;
import structurePattern.FacadePattern.facade.ShapeMaker;
import structurePattern.adapterPattern.player.impl.AudioPlayer;
import structurePattern.bridgePattern.bridge.impl.GreenCircle;
import structurePattern.bridgePattern.bridge.impl.RedCircle;
//import structurePattern.bridgePattern.shape.Shape;
//import structurePattern.bridgePattern.shape.impl.Circle;
import structurePattern.compositePattern.entity.Employee;
import structurePattern.decoratorPattern.decorator.RedShapeDecorator;
import structurePattern.decoratorPattern.entity.Shape;
import structurePattern.decoratorPattern.entity.impl.Rectangle;
import structurePattern.flyweightPattern.entity.impl.Circle;
import structurePattern.flyweightPattern.factory.ShapeFactory;
import structurePattern.proxyPattern.entity.Image;
import structurePattern.proxyPattern.entity.impl.ProxyImage;

public class Main {

    private static final String colors[] = {
      "Red", "Green", "Blue", "White", "Black"
    };

    private static String getRandomColor(){
        return colors[(int)Math.random() * colors.length];
    }

    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }

    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }

    /**
     *  14. 责任链模式的工具方法
     * */
    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.INFO);

        //创建责任链
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    /**
     *  16. 解释器模式
     * */
    //规则：Robert和John都是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie是一个已婚女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

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
        /*MealBuilder mealBuilder = new MealBuilder();
        //素菜Meal
        Meal vegMeal  = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal: ");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());
        //荤菜Meal
        Meal nonVegMean = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal: ");
        nonVegMean.showItems();
        System.out.println("Total cost: "+nonVegMean.getCost());*/

        /**
         * 5. 原型模式演示
         * */
        /*ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());*/

        /**
         * 6. 适配器模式演示
         *  用MediaAdapter将AudioPlayer和AdvancedMediaPlayer适配起来，可以通过MediaPlayer使用AdvancedMediaPlayer
         * */
        /*AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");*/

        /**
         * 7. 桥接器模式的演示
         * */
        /*Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100,10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();*/

        /**
         * 9. 组合模式演示
         * */
        //步骤2：使用 Employee 类来创建和打印员工的层次结构。
        /*Employee CEO = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Bob", "Sales", 10000);

        //建立组合树状结构
        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印所有员工
        System.out.println(CEO);
        for (Employee headEmployee: CEO.getSubordinates()){
            System.out.println(headEmployee);
            for (Employee employee: headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }*/

        /**
         * 10. 装饰器模式演示
         * */
        //步骤5. 使用RedShapeDecorator来装饰Shape对象
        /*Shape circle = new structurePattern.decoratorPattern.entity.impl.Circle();
        Shape redCircle = new RedShapeDecorator(new structurePattern.decoratorPattern.entity.impl.Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();*/

        /**
         * 11. 外观模式的演示
         *      利用外观类去操作Shape
         * */
        /*ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();*/

        /**
         * 12. 享元模式演示
         *      使用传递过来的颜色来获取实体对象，HashMap中有的话就直接获取
         *      没有就自己创建了压入这个HashMap中，避免了对象的重复创建
         * */
        /*for (int i = 0; i < 20; ++i){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }*/

        /**
         *  13. 代理模式演示
         *     代理类和被代理类同时实现同一个接口
         *     代理类中有被代理类的对象，实现两者之间的联系关系
         * */
        /*Image image = new ProxyImage("test_10mb.jpg");
        //图像从磁盘加载
        image.display();
        System.out.println();
        //图像不需要从磁盘加载
        image.display();*/

        /* ================================== 行为型模式 =================================== */

        /**
         *  14. 责任链模式演示
         * */
        /*AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.INFO, "This is a debug information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");*/

        /**
         * 15. 命令模式演示
         * */
        /*Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();*/

        /**
         * 16. 解释器模式演示
         * */
        /*Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));*/

        /**
         * 17. 迭代器模式的应用
         * */
        /*NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }*/

        /**
         * 18. 中介者模式演示
         * */
        /*User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi, John!");
        john.sendMessage("Hi, Robert!");*/

        /*
        * 19. 备忘录模式演示
        * **/
        /*Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());*/

        /**
         * 20. 观察者模式演示
         * */
        /*Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);*/

        /**
         * 21. 状态模式演示
         * */
        /*Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());*/

        /**
         * 22. 空对象模式演示
         * */
        /*AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());*/

        /**
         *  23. 策略模式演示
         * */
        behaviorPattern.strategyPattern.context.Context context = new behaviorPattern.strategyPattern.context.Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new behaviorPattern.strategyPattern.context.Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new behaviorPattern.strategyPattern.context.Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
