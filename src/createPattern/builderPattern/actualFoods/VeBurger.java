package createPattern.builderPattern.actualFoods;

import createPattern.builderPattern.item.impl.Burger;

/**
 * @author zxf
 * @date 2018/9/4 9:27
 */
public class VeBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
