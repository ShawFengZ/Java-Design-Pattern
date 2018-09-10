package structurePattern.flyweightPattern.entity.impl;

import structurePattern.flyweightPattern.entity.Shape;

/**
 * @author zxf
 * @date 2018/9/10 8:57
 */
//创建一个接口的实现类
public class Circle implements Shape {

    private String color;

    private int x;

    private int y;

    private int radius;

    @Override
    public void draw() {
        System.out.println("Circle Draw() [Color : "+
                color + ", x: " + x + ", y: "+ y +", radius: " + radius + " ]");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }
}
