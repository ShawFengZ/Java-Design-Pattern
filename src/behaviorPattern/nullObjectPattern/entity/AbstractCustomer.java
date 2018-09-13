package behaviorPattern.nullObjectPattern.entity;

/**
 * @author zxf
 * @date 2018/9/13 13:56
 */
//步骤1：创建一个抽象类
public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}