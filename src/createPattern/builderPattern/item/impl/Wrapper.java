package createPattern.builderPattern.item.impl;

import createPattern.builderPattern.item.Packing;

/**
 * @author zxf
 * @date 2018/9/4 9:20
 */
//Packing的实现类，Wrapper
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
