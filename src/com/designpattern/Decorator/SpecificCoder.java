package com.designpattern.Decorator;
/**
 * 具体构建角色
 * 一个具体的程序员
 * @author Json
*/
public class SpecificCoder implements Coder {
	@Override
	public void writeCode() {
		System.out.println("我是一个程序员,我能写代码...");
	}
}
