package behaviorPattern.strategyPattern.strategy.impl;

import behaviorPattern.strategyPattern.strategy.Strategy;

/**
 * @author zxf
 * @date 2018/9/13 14:24
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
