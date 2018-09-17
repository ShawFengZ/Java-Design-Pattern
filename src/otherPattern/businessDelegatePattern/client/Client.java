package otherPattern.businessDelegatePattern.client;

import otherPattern.businessDelegatePattern.delegate.BusinessDelegate;

/**
 * @author zxf
 * @date 2018/9/17 9:27
 */
//步骤5，创建客户端
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
