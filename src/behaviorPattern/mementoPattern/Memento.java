package behaviorPattern.mementoPattern;

/**
 * @author zxf
 * @date 2018/9/12 9:39
 */
//步骤1：创建Memento类，来保存要恢复的对象的状态
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
