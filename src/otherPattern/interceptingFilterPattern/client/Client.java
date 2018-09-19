package otherPattern.interceptingFilterPattern.client;

import otherPattern.interceptingFilterPattern.filter.FilterManager;

/**
 * @author zxf
 * @date 2018/9/19 13:38
 */
//步骤6：创建客户端
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
