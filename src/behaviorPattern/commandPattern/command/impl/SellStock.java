package behaviorPattern.commandPattern.command.impl;

import behaviorPattern.commandPattern.command.Order;
import behaviorPattern.commandPattern.request.Stock;

/**
 * @author zxf
 * @date 2018/9/11 8:39
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute(){
        abcStock.sell();
    }
}
