package behaviorPattern.observerPattern;

/**
 * @author zxf
 * @date 2018/9/12 19:43
 */
//步骤2：创建Observer的抽象类
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
