package com.designpattern.iterator;
/**
 * 抽象容器
 * @author Json
*/
public interface Aggregate {

	public void add(Object obj);
	
	public void remove(Object obj);
	
	public Iterator iterator();
}
