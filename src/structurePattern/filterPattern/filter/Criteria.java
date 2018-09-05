package structurePattern.filterPattern.filter;

import structurePattern.filterPattern.entity.Person;

import java.util.List;

/**
 * @author zxf
 * @date 2018/9/5 9:33
 */
//为标准(Criteria)创建一个接口
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
