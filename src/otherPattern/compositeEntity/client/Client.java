package otherPattern.compositeEntity.client;

import otherPattern.compositeEntity.compositeEntity.CompositeEntity;

/**
 * @author zxf
 * @date 2018/9/17 9:45
 */
//步骤4，创建使用组合实体的客户端类
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; ++i){
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
