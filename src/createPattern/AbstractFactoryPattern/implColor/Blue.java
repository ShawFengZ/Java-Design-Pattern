package createPattern.AbstractFactoryPattern.implColor;

import createPattern.AbstractFactoryPattern.colorInterface.Color;

/**
 * @author zxf
 * @date 2018/9/3 15:07
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
