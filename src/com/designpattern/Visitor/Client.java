package com.designpattern.Visitor;

/**
 * 客户端测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {
	public static void main(String[] args) {
		Home owerHome = new Home();
		owerHome.add(new Dog());
		owerHome.add(new Cat());

		Owner owner = new Owner();
		owerHome.action(owner);
		
		Someone someone = new Someone();
		owerHome.action(someone);
	}
}
