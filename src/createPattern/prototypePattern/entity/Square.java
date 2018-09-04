package createPattern.prototypePattern.entity;

import createPattern.prototypePattern.cloneClass.Shape;

/**
 * @author zxf
 * @date 2018/9/4 10:44
 */
//步骤2：创建扩展了上面抽象类的实体类。
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method!");
    }
}
