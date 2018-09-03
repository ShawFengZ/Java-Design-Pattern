package createPattern.singletonPattern.demo;

/**
 * @author zxf
 * @date 2018/9/3 15:54
 */
public class SingleObject {

    //创建一个SingleObject的对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为private, 这样该类就不会被实例化，也就是不可能通过new的方式创建了
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
