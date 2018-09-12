package behaviorPattern.mediatorPattern.mediator;

import behaviorPattern.mediatorPattern.user.User;

import java.util.Date;

/**
 * @author zxf
 * @date 2018/9/12 9:19
 */
//步骤1：创建中介类
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] :" + message);
    }
}
