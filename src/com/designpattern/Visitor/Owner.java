package com.designpattern.Visitor;

/**
 * 具体访问者角色 -- 主人
 * @author Json<<json1990@foxmail.com>>
 */
public class Owner extends Person {

	@Override
	public void feed(Cat cat) {
		System.out.println("主人喂食猫");
	}

	@Override
	public void feed(Dog dog) {
		System.out.println("主人喂食狗");		
	}
}
