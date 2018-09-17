package otherPattern.compositeEntity.compositeEntity;

import otherPattern.compositeEntity.coarseObject.CoarseGrainedObject;

/**
 * @author zxf
 * @date 2018/9/17 9:43
 */
//步骤3：创建组合实体
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
