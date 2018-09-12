package behaviorPattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/12 9:43
 */
//步骤3：创建CareTaker类，负责从Memento中恢复对象的状态
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
