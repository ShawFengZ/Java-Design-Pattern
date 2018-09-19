package otherPattern.serviceLocatorPattern;

import otherPattern.serviceLocatorPattern.service.impl.Service1;
import otherPattern.serviceLocatorPattern.service.impl.Service2;

/**
 * @author zxf
 * @date 2018/9/19 13:54
 */
//步骤3：为 JNDI 查询创建 InitialContext。
public class InitialContext {
    public Object lookup(String jndiName){
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("Service2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
