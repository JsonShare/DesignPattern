package com.designpattern.Decorator;
/**
 * 装饰角色
 * @author Json
*/
public class Decorator implements Coder {
	
	private Coder coder;
	public Decorator(Coder coder) {
		this.coder = coder;
	}
	
	@Override
	public void writeCode() {
		coder.writeCode();
		//可以追加功能
	}
}
