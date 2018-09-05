package structurePattern.bridgePattern.bridge.impl;

import structurePattern.bridgePattern.bridge.DrawAPI;

/**
 * @author zxf
 * @date 2018/9/5 9:14
 */
//创建实现了DrawAPI接口的实体桥接实现类
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color : red, redius: "
                + radius + ", x: " + x + ", y: " + y);
    }
}
