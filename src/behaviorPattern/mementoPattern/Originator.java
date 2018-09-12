package behaviorPattern.mementoPattern;

/**
 * @author zxf
 * @date 2018/9/12 9:40
 */
//步骤2：创建Originator,是要恢复状态的那个对象的类
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //将状态保存到Memento
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    //从Memento中获取状态0
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
