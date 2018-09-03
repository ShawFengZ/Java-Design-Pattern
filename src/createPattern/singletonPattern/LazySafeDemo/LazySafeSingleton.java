package createPattern.singletonPattern.LazySafeDemo;

/**
 * @author zxf
 * @date 2018/9/3 16:13
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton(){}

    //比较懒汉不安全模式多加了同步锁
    public static synchronized LazySafeSingleton getInstance(){
        if (instance == null){
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
