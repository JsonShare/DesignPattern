package com.designpattern.iterator;

import java.util.ArrayList;
/**
 * 具体迭代器实现
 * @author Json
*/
public class ConcreteIterator implements Iterator {

	private ArrayList list = new ArrayList();
	private int cursor = 0;
	
	public ConcreteIterator(ArrayList list) {
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		if(cursor == list.size()){
			return false;
		}
		return true;
	}
	
	@Override
	public Object next() {
		if(this.hasNext()){
			return this.list.get(cursor++);
		}
		return null;
	}
}
