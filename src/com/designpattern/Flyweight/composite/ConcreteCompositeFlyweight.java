package com.designpattern.Flyweight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色
 * @author Json<<json1990@foxmail.com>>
 */
public class ConcreteCompositeFlyweight implements Flyweight {
    private Map<String,Flyweight> flies = new HashMap<String,Flyweight>();
    
    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(String key , Flyweight fly){
        flies.put(key,fly);
    }
    
    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void operation(String state) {
        Flyweight fly = null;
        for(Object o : flies.keySet()){
            fly = flies.get(o);
            fly.operation(state);
        }
    }
}
