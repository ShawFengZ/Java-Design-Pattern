package behaviorPattern.StatePattern.state.impl;

import behaviorPattern.StatePattern.context.Context;
import behaviorPattern.StatePattern.state.State;

/**
 * @author zxf
 * @date 2018/9/13 13:44
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop state";
    }
}
