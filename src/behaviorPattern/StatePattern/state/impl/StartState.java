package behaviorPattern.StatePattern.state.impl;

import behaviorPattern.StatePattern.context.Context;
import behaviorPattern.StatePattern.state.State;

/**
 * @author zxf
 * @date 2018/9/13 13:43
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        context.setState(this);

    }

    public String toString(){
        return "Start State";
    }
}
