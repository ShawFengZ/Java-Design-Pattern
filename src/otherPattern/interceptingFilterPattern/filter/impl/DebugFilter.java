package otherPattern.interceptingFilterPattern.filter.impl;

import otherPattern.interceptingFilterPattern.filter.Filter;

/**
 * @author zxf
 * @date 2018/9/19 13:31
 */
//步骤2：创建实体过滤器
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
