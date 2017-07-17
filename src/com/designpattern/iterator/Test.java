package com.designpattern.iterator;
/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		agg.add("Java");
		agg.add("Ruby");
		agg.add("Python");
		
		Iterator iterator = agg.iterator();
		while(iterator.hasNext()){
			String s = (String) iterator.next();
			System.out.println(s);
		}
	}
}
