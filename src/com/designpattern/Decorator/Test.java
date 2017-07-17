package com.designpattern.Decorator;
/**
 * 测试
 * @author Json
*/
public class Test {
	public static void main(String[] args) {
		Coder coder = new SpecificCoder();
		
		System.out.println("第一次装饰 ↓↓↓");
		Decorator javacoder = new JavaCoder(coder);
		javacoder.writeCode();
		
		System.out.println("第二次装饰 ↓↓↓");
		Decorator javaarchitect = new JavaArchitect(javacoder);
		javaarchitect.writeCode();
		
		
		System.out.println("------------------------------------");
		System.out.println("一步装饰多次 ↓↓↓");
		//一步装饰多次
		Decorator javaarchitect_1 = new JavaArchitect(new JavaCoder(new SpecificCoder())); 
		javaarchitect_1.writeCode();
	}
}
