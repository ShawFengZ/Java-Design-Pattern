package createPattern.builderPattern.actualFoods;

import createPattern.builderPattern.item.impl.ColdDrink;

/**
 * @author zxf
 * @date 2018/9/4 9:30
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
