package behaviorPattern.nullObjectPattern.factory;

import behaviorPattern.nullObjectPattern.entity.AbstractCustomer;
import behaviorPattern.nullObjectPattern.entity.NullCustomer;
import behaviorPattern.nullObjectPattern.entity.RealCustomer;

/**
 * @author zxf
 * @date 2018/9/13 14:01
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++){
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
