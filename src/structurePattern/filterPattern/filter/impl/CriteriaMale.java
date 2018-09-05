package structurePattern.filterPattern.filter.impl;

import structurePattern.filterPattern.entity.Person;
import structurePattern.filterPattern.filter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/5 9:37
 */
//创建实现了Criteria接口的实现类。过滤出男性
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person p: persons){
            if (p.getGender().equalsIgnoreCase("MALE"))
                malePersons.add(p);
        }
        return malePersons;
    }
}
