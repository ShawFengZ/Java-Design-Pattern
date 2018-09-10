package behaviorPattern.chainOfResponsibilityPattern;

import behaviorPattern.chainOfResponsibilityPattern.AbstractLogger;

/**
 * @author zxf
 * @date 2018/9/10 10:11
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}
