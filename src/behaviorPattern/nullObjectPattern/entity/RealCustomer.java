package behaviorPattern.nullObjectPattern.entity;

import behaviorPattern.chainOfResponsibilityPattern.AbstractLogger;

/**
 * @author zxf
 * @date 2018/9/13 13:58
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
