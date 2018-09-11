package behaviorPattern.interpreterPattern.expression;

/**
 * @author zxf
 * @date 2018/9/11 9:05
 */
//步骤1：创建一个表达式接口
public interface Expression {
    public boolean interpret(String context);
}
