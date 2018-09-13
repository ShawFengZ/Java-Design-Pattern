package behaviorPattern.strategyPattern.strategy.impl;

import behaviorPattern.strategyPattern.strategy.Strategy;

/**
 * @author zxf
 * @date 2018/9/13 14:19
 */
//步骤2：创建策略接口的实现类，实现不同的算法
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
