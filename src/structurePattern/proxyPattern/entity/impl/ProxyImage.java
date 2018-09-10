package structurePattern.proxyPattern.entity.impl;

import structurePattern.proxyPattern.entity.Image;

/**
 * @author zxf
 * @date 2018/9/10 9:33
 */
//代理类，与实际类实现同一个接口，并且代理类中有一个实际类的对象
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
