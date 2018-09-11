package behaviorPattern.commandPattern.call;

import behaviorPattern.commandPattern.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/11 8:50
 */
//步骤4：创建命令调用类
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
