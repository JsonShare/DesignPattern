package com.designpattern.Flyweight.simple;

/**
 * 测试
 * @author Json<<json1990@foxmail.com>>
 */
public class Client {

	public static void main(String[] args) {
		FlyweightFactory flyfactory = new FlyweightFactory(); 
		Flyweight fly1 = flyfactory.factory(Menu.水煮肉片); 
		fly1.operation("张三点菜"); 
		
		Flyweight fly2 = flyfactory.factory(Menu.酸菜鱼); 
		fly2.operation("李四点菜"); 
		
		Flyweight fly3 = flyfactory.factory(Menu.酸辣土豆丝); 
		fly3.operation("王五点菜"); 
		
		Flyweight fly4 = flyfactory.factory(Menu.酸辣土豆丝); 
		fly4.operation("刘六点菜"); 
		
		Flyweight fly5 = flyfactory.factory(Menu.酸辣土豆丝); 
		fly5.operation("赵七点菜"); 
		
		System.out.println(flyfactory.getFlyweightSize());;
	}
}
