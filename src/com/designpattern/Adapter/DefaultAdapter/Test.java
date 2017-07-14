package com.designpattern.Adapter.DefaultAdapter;
/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		Person p = new Student("张三");
		p.study();
		p.eat();
		p.sleep();
		System.out.println("我是"+p.getName());
	}
}
