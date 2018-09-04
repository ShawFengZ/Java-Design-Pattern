package createPattern.prototypePattern.entity;

import createPattern.prototypePattern.cloneClass.Shape;

/**
 * @author zxf
 * @date 2018/9/4 10:45
 */
//步骤2：创建扩展了上面抽象类的实体类。
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method!");
    }
}
