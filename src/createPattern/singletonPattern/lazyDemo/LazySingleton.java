package createPattern.singletonPattern.lazyDemo;
/**
 * @author zxf
 * @date 2018/9/3 16:08
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
