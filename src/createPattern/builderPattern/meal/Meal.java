package createPattern.builderPattern.meal;

import createPattern.builderPattern.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/4 9:34
 */
//5. 创建一个Meal类，带有上面定义的Item对象
public class Meal {
    private List<Item> items = new ArrayList<>();

    //添加条目
    public void addItem(Item item){
        items.add(item);
    }

    //计算总消费
    public float getCost(){
        float cost = 0.0f;
        for (Item item: items){
            cost += item.price();
        }
        return cost;
    }

    //展示有哪些食物
    public void showItems(){
        for (Item item: items){
            System.out.print("Item: "+item.name());
            System.out.print(",Packing: "+item.packing().pack());
            System.out.println(",price: "+item.price());
        }
    }
}
