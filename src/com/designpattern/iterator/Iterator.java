package com.designpattern.iterator;
/**
 * 抽象迭代器接口
 * @author Json
*/
public interface Iterator {
	
	public boolean hasNext();
	
	public Object next();
}
