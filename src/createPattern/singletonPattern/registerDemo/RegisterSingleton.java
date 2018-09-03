package createPattern.singletonPattern.registerDemo;

/**
 * @author zxf
 * @date 2018/9/3 16:48
 */
public class RegisterSingleton {

    private static class SingletonHolder{
        private static final RegisterSingleton INSTANCE = new RegisterSingleton();
    }

    private RegisterSingleton(){}

    public static final RegisterSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
