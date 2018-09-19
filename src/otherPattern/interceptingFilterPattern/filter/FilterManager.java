package otherPattern.interceptingFilterPattern.filter;

import otherPattern.interceptingFilterPattern.target.Target;

/**
 * @author zxf
 * @date 2018/9/19 13:36
 */
//步骤5：创建过滤器管理器
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
