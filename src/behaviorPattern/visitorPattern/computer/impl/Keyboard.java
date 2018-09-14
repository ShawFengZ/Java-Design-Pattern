package behaviorPattern.visitorPattern.computer.impl;

import behaviorPattern.visitorPattern.computer.ComputerPart;
import behaviorPattern.visitorPattern.visitor.ComputerPartVisitor;

/**
 * @author zxf
 * @date 2018/9/14 10:17
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
