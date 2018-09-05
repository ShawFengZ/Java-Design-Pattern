package structurePattern.filterPattern.filter.impl;

import structurePattern.filterPattern.entity.Person;
import structurePattern.filterPattern.filter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/5 9:42
 */
//创建实现了 Criteria 接口的实体类。过滤出单身人群
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person: persons){
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
