package behaviorPattern.StatePattern.state;

import behaviorPattern.StatePattern.context.Context;

/**
 * @author zxf
 * @date 2018/9/13 13:41
 */
public interface State {
    public void doAction(Context context);
}
