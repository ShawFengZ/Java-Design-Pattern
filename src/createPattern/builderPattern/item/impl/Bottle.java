package createPattern.builderPattern.item.impl;

import createPattern.builderPattern.item.Packing;

/**
 * @author zxf
 * @date 2018/9/4 9:20
 */
//Packing的实现类，瓶子
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
