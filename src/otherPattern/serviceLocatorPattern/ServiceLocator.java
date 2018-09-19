package otherPattern.serviceLocatorPattern;

import otherPattern.serviceLocatorPattern.service.Service;

/**
 * @author zxf
 * @date 2018/9/19 14:00
 */
//步骤5：创建服务定位器
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getServic(String jndiName){
        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }

}
