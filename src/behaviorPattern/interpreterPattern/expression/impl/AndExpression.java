package behaviorPattern.interpreterPattern.expression.impl;

import behaviorPattern.interpreterPattern.expression.Expression;

/**
 * @author zxf
 * @date 2018/9/11 9:10
 */
//步骤2：创建实现接口的实现类
public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
