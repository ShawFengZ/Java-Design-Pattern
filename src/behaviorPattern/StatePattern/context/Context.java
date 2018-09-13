package behaviorPattern.StatePattern.context;

import behaviorPattern.StatePattern.state.State;

/**
 * @author zxf
 * @date 2018/9/13 13:42
 */
//步骤3：创建Context类
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
