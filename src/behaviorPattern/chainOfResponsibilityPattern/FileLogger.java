package behaviorPattern.chainOfResponsibilityPattern;

/**
 * @author zxf
 * @date 2018/9/10 10:17
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
