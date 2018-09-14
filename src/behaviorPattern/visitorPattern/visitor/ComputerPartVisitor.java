package behaviorPattern.visitorPattern.visitor;

import behaviorPattern.visitorPattern.computer.impl.Computer;
import behaviorPattern.visitorPattern.computer.impl.Keyboard;
import behaviorPattern.visitorPattern.computer.impl.Monitor;
import behaviorPattern.visitorPattern.computer.impl.Mouse;

/**
 * @author zxf
 * @date 2018/9/14 10:18
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
