package behaviorPattern.mediatorPattern.user;

import behaviorPattern.mediatorPattern.mediator.ChatRoom;

/**
 * @author zxf
 * @date 2018/9/12 9:21
 */
//步骤2：创建user类
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    //调用中介类，完成类与类之间的通信
    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
