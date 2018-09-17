package otherPattern.businessDelegatePattern.servicePojo.impl;

import otherPattern.businessDelegatePattern.servicePojo.BusinessService;

/**
 * @author zxf
 * @date 2018/9/17 9:21
 */
//步骤2：创建实体服务类
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
