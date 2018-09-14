package behaviorPattern.visitorPattern.visitor.impl;

import behaviorPattern.visitorPattern.computer.impl.Computer;
import behaviorPattern.visitorPattern.computer.impl.Keyboard;
import behaviorPattern.visitorPattern.computer.impl.Monitor;
import behaviorPattern.visitorPattern.computer.impl.Mouse;
import behaviorPattern.visitorPattern.visitor.ComputerPartVisitor;

/**
 * @author zxf
 * @date 2018/9/14 10:26
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer!");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse!");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard!");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor!");
    }
}
