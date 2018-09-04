package createPattern.builderPattern.actualFoods;

import createPattern.builderPattern.item.impl.Burger;

/**
 * @author zxf
 * @date 2018/9/4 9:28
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
