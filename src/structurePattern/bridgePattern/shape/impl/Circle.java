package structurePattern.bridgePattern.shape.impl;

import structurePattern.bridgePattern.bridge.DrawAPI;
import structurePattern.bridgePattern.shape.Shape;

/**
 * @author zxf
 * @date 2018/9/5 9:19
 */
public class Circle extends Shape {
    int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
