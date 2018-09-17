package otherPattern.businessDelegatePattern.BusinessLookUp;

import com.sun.org.apache.regexp.internal.RE;
import otherPattern.businessDelegatePattern.servicePojo.BusinessService;
import otherPattern.businessDelegatePattern.servicePojo.impl.EJBService;
import otherPattern.businessDelegatePattern.servicePojo.impl.JMSService;

/**
 * @author zxf
 * @date 2018/9/17 9:23
 */
//步骤3：创建业务查询服务
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
