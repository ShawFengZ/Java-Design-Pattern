package otherPattern.businessDelegatePattern.delegate;

import otherPattern.businessDelegatePattern.BusinessLookUp.BusinessLookUp;
import otherPattern.businessDelegatePattern.servicePojo.BusinessService;

/**
 * @author zxf
 * @date 2018/9/17 9:25
 */
//步骤4，创建业务代表
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);;
        businessService.doProcessing();
    }
}
