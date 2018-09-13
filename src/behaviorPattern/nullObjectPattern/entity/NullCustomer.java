package behaviorPattern.nullObjectPattern.entity;

/**
 * @author zxf
 * @date 2018/9/13 14:00
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not available inCustomer Database";
    }
}
