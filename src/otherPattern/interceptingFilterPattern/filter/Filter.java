package otherPattern.interceptingFilterPattern.filter;

/**
 * @author zxf
 * @date 2018/9/19 13:29
 */
//步骤1：创建过滤器接口Filter
public interface Filter {
    public void execute(String request);
}
