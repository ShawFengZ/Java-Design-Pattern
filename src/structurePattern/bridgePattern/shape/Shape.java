package structurePattern.bridgePattern.shape;

import structurePattern.bridgePattern.bridge.DrawAPI;

/**
 * @author zxf
 * @date 2018/9/5 9:16
 */
//步骤4：创建实现了Shape接口的实体类
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract  void draw();
}
