package com.designpattern.Visitor;

/**
 * 具体访问者角色 -- 其他人
 * @author Json<<json1990@foxmail.com>>
 */
public class Someone extends Person {

	@Override
	public void feed(Cat cat) {
		System.out.println("其他人喂食猫");
	}

	@Override
	public void feed(Dog dog) {
		System.out.println("其他人喂食狗");		
	}
}
