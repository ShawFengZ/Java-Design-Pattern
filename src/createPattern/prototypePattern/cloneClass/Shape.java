package createPattern.prototypePattern.cloneClass;

import javafx.beans.binding.ObjectExpression;

import java.util.StringTokenizer;

/**
 * @author zxf
 * @date 2018/9/4 10:33
 */
//步骤1：创建一个实现了Clonable接口的抽象类
public abstract class Shape implements Cloneable{

    private String id;

    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    //ctrl+Alt+T实现try...catch...快捷键
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
