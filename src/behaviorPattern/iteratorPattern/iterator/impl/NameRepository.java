package behaviorPattern.iteratorPattern.iterator.impl;


import behaviorPattern.iteratorPattern.iterator.Container;
import behaviorPattern.iteratorPattern.iterator.Iterator;

/**
 * @author zxf
 * @date 2018/9/11 9:28
 */
//步骤2：实现Container接口的实体类
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
