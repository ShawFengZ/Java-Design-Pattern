package behaviorPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/12 19:42
 */
//步骤1：创建Subject类
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer: observers){
            observer.update();
        }
    }
}
