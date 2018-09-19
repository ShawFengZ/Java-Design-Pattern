package otherPattern.frontControllerPattern;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author zxf
 * @date 2018/9/19 13:21
 */
//步骤3：创建前端控制器FrontController
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully!");
        return true;
    }

    public void trackRequest(String request){
        System.out.println("Page request: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户身份进行认证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
