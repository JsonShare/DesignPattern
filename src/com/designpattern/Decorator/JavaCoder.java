package com.designpattern.Decorator;
/**
 * 一个具体的装饰角色
 * java普通程序员
 * @author Json
*/
public class JavaCoder extends Decorator {
	
	public JavaCoder(Coder coder) {
		super(coder);
	}

	@Override
	public void writeCode(){
		super.writeCode();
		//可以追加功能
		System.out.println("我是Java程序员...");
	}
}
