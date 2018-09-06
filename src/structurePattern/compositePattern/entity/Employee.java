package structurePattern.compositePattern.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/6 8:52
 */
//步骤1：创建 Employee 类，该类带有 Employee 对象的列表。
public class Employee {

    private String name;

    private String dept;

    private int salary;

    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
