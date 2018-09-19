package otherPattern.transferObjectPattern;

/**
 * @author zxf
 * @date 2018/9/19 14:11
 */
//步骤1： 创建传输对象
public class StudentVO {
    private String name;
    private int rollNo;

    public StudentVO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
