package com.designpattern.Visitor;

/**
 * 具体节点（元素）角色 -- 宠物狗
 * @author Json<<json1990@foxmail.com>>
 */
public class Dog extends Animal {

	@Override
	public void accept(Person person) {
		person.feed(this);
		System.out.println("好好吃，汪汪汪！！！");
	}
}
