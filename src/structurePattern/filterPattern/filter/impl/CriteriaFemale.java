package structurePattern.filterPattern.filter.impl;

import structurePattern.filterPattern.entity.Person;
import structurePattern.filterPattern.filter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/5 9:39
 */
//创建实现了 Criteria 接口的实体类。过滤出女性
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person: persons){
            if (person.getGender().equalsIgnoreCase("FEMALE"))
                femalePersons.add(person);
        }
        return femalePersons;
    }
}
