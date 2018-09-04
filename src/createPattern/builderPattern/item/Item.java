package createPattern.builderPattern.item;

/**
 * @author zxf
 * @date 2018/9/4 9:17
 */
//食物条目接口
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
