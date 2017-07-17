package com.designpattern.Decorator;
/**
 * 一个具体的装饰角色
 * java架构师
 * @author Json
*/
public class JavaArchitect extends Decorator {
	
	public JavaArchitect(Coder coder) {
		super(coder);
	}

	@Override
	public void writeCode(){
		super.writeCode();
		//可以追加功能
		System.out.println("我是Java架构师...");
	}
}
