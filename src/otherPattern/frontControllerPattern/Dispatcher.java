package otherPattern.frontControllerPattern;

import otherPattern.frontControllerPattern.view.HomeView;
import otherPattern.frontControllerPattern.view.StudentView;

/**
 * @author zxf
 * @date 2018/9/19 13:18
 */
//步骤2：创建调度器
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        this.studentView = new StudentView();
        this.homeView = new HomeView();
    }

    public void  dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
