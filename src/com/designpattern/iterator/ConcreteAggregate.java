package com.designpattern.iterator;

import java.util.ArrayList;
/**
 * 具体容器
 * @author Json
*/
public class ConcreteAggregate implements Aggregate {
	
	private ArrayList list = new ArrayList();
	
	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(list);
	}

}
