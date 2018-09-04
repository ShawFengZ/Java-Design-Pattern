package createPattern.builderPattern.actualFoods;

import createPattern.builderPattern.item.impl.ColdDrink;

/**
 * @author zxf
 * @date 2018/9/4 9:29
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
