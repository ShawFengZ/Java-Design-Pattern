package structurePattern.filterPattern.filter.impl;

import structurePattern.filterPattern.entity.Person;
import structurePattern.filterPattern.filter.Criteria;

import java.util.List;

/**
 * @author zxf
 * @date 2018/9/5 9:50
 */
//与过滤器，可以同时过滤前面的单一过滤器中的两个
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);//第一次过滤
        return otherCriteria.meetCriteria(firstCriteriaPersons);//第二次过滤
    }
}
