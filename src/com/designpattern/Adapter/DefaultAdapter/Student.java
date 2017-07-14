package com.designpattern.Adapter.DefaultAdapter;
/**
 * 定义一个学生  继承了交往PersonAdapter抽象类 
 * 学生 并没有继承 所有Person的行为，比如现在 还不用work
 * @author Json
*/
public class Student extends PersonAdapter{
	private String name;
	public Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void study() {
		System.out.println("学习");
	}

	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}
}
