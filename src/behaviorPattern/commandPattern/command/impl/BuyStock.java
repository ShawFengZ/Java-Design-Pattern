package behaviorPattern.commandPattern.command.impl;

import behaviorPattern.commandPattern.command.Order;
import behaviorPattern.commandPattern.request.Stock;

/**
 * @author zxf
 * @date 2018/9/11 8:38
 */
//步骤3：创建Order接口的实现类
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute(){
        abcStock.buy();
    }
}
