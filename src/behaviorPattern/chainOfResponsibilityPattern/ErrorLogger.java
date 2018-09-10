package behaviorPattern.chainOfResponsibilityPattern;

/**
 * @author zxf
 * @date 2018/9/10 10:16
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
