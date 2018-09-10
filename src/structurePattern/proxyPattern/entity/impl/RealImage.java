package structurePattern.proxyPattern.entity.impl;

import structurePattern.proxyPattern.entity.Image;

/**
 * @author zxf
 * @date 2018/9/10 9:30
 */
//步骤2：创建实现接口的实体类
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
