package behaviorPattern.visitorPattern.computer.impl;

import behaviorPattern.visitorPattern.computer.ComputerPart;
import behaviorPattern.visitorPattern.visitor.ComputerPartVisitor;

/**
 * @author zxf
 * @date 2018/9/14 10:20
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;
    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
