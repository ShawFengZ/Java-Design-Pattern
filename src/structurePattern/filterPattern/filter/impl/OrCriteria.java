package structurePattern.filterPattern.filter.impl;

import structurePattern.filterPattern.entity.Person;
import structurePattern.filterPattern.filter.Criteria;

import java.util.List;

/**
 * @author zxf
 * @date 2018/9/5 9:54
 */
public class OrCriteria implements Criteria {

    //第一个过滤器
    private Criteria criteria;
    //第二个过滤器
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        //合并两个list
        for (Person person: otherCriteriaItems){
            if (!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
