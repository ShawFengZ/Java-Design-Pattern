package createPattern.builderPattern.item.impl;

import createPattern.builderPattern.item.Item;
import createPattern.builderPattern.item.Packing;

/**
 * @author zxf
 * @date 2018/9/4 9:22
 */
//创建Item接口的抽象类，该类提供了默认的功能
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
