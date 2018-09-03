package createPattern.singletonPattern.starveDemo;

import createPattern.singletonPattern.demo.SingleObject;

/**
 * @author zxf
 * @date 2018/9/3 16:30
 */
public class StarveSingleton {
    //类一加载就要初始化，浪费内存，因为不一定什么时候才用得到
    private static StarveSingleton instance = new StarveSingleton();

    private StarveSingleton(){}

    public static StarveSingleton getInstance(){
        return instance;
    }

}
