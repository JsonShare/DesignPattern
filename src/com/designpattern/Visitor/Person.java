package com.designpattern.Visitor;

/**
 * 抽象访问者接口  -- 人
 * @author Json<<json1990@foxmail.com>>
 */
public abstract class Person {
	/**
	 * 喂食狗
	 */
	public abstract void feed(Cat cat);
	
	/**
	 * 喂食猫
	 */
	public abstract void feed(Dog dog);
}
