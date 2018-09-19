package otherPattern.interceptingFilterPattern.filter.impl;

import otherPattern.interceptingFilterPattern.filter.Filter;

import java.io.FileInputStream;

/**
 * @author zxf
 * @date 2018/9/19 13:30
 */
//步骤2：创建实体过滤器
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
