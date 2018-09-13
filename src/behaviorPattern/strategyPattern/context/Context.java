package behaviorPattern.strategyPattern.context;

import behaviorPattern.strategyPattern.strategy.Strategy;

/**
 * @author zxf
 * @date 2018/9/13 14:20
 */
// 创建Context用来选择不同的策略算法
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
