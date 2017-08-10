package com.designpattern.Flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author Json<<json1990@foxmail.com>>
 */
public class FlyweightFactory {
	/**
	 * 缓存多个flyweight对象，这里只是示意一下
	 */
	private Map<String,Flyweight> fsMap = new HashMap<String,Flyweight>();

	/**
	 * 获取key对应的享元对象
	 * @param key 获取享元对象的key，只是示意
	 * @return key 对应的享元对象
	 */
	public Flyweight factory(String key) {
		//这个方法里面基本的实现步骤如下：
		//先从缓存里面查找，是否存在key对应的Flyweight对象
		Flyweight f = fsMap.get(key);

		//如果存在，就返回相对应的Flyweight对象
		if(f == null){
			//如果不存在
			//创建一个新的Flyweight对象
			f = new ConcreteFlyweight(key);
			//把这个新的Flyweight对象添加到缓存里面
			fsMap.put(key,f);
		}
		return f;
	}

	//获取flyweight对象个数
	public int getFlyweightSize() {
		return fsMap.size();
	}
}
