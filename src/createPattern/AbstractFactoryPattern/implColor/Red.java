package createPattern.AbstractFactoryPattern.implColor;

import createPattern.AbstractFactoryPattern.colorInterface.Color;

/**
 * @author zxf
 * @date 2018/9/3 15:06
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}
