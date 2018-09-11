package behaviorPattern.interpreterPattern.expression.impl;

import behaviorPattern.interpreterPattern.expression.Expression;

/**
 * @author zxf
 * @date 2018/9/11 9:06
 */
//步骤2：创建实现接口的实现类
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        //判断上下文中是否有子字符串
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
