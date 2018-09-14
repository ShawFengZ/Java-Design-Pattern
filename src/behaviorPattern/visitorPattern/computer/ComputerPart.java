package behaviorPattern.visitorPattern.computer;

import behaviorPattern.visitorPattern.visitor.ComputerPartVisitor;

/**
 * @author zxf
 * @date 2018/9/14 10:10
 */
//步骤1：定义一个表示元素的接口
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
