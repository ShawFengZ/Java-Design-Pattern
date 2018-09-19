package otherPattern.serviceLocatorPattern.service.impl;

import otherPattern.serviceLocatorPattern.service.Service;

/**
 * @author zxf
 * @date 2018/9/19 13:48
 */
//步骤2：创建实体服务。
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
