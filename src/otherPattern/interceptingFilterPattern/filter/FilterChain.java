package otherPattern.interceptingFilterPattern.filter;

import otherPattern.interceptingFilterPattern.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/19 13:33
 */
//步骤4：创建过滤器链
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter: filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
