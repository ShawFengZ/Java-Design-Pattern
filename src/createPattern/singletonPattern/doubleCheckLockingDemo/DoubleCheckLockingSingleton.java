package createPattern.singletonPattern.doubleCheckLockingDemo;

/**
 * @author zxf
 * @date 2018/9/3 16:36
 */
//双锁校验模式
public class DoubleCheckLockingSingleton {

    /**
     * volatile关键字是和并发编程紧密相关的一个概念
     * */
    private volatile static DoubleCheckLockingSingleton doubleCheckLockingSingleton;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getDoubleCheckLockingSingleton(){
        if (doubleCheckLockingSingleton == null){
            synchronized (DoubleCheckLockingSingleton.class) {
                if (doubleCheckLockingSingleton == null){
                    doubleCheckLockingSingleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return doubleCheckLockingSingleton;
    }
}
