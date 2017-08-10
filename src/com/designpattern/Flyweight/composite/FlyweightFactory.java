package com.designpattern.Flyweight.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元工厂
 * @author Json<<json1990@foxmail.com>>
 */
public class FlyweightFactory {
	
    private Map<String,Flyweight> flies = new HashMap<String,Flyweight>();
    
    /**
     * 复合享元工厂方法
     */
    public Flyweight factory(List<String> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        for(String state : compositeState){
            compositeFly.add(state,this.factory(state));
        }
        return compositeFly;
    }
   
    /**
     * 单纯享元工厂方法
     */
    public Flyweight factory(String state){
        //先从缓存中查找对象
        Flyweight fly = flies.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            flies.put(state, fly);
        }
        return fly;
    }
    
    // 得到存对象的集合的长度
    public int getFlyWeightSize() {
        return flies.size();
    }
}
