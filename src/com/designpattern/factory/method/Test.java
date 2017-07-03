package com.designpattern.factory.method;

/**
* 类说明 ：测试
*/
public class Test {
	public static void main(String[] args) {
		MobileFactory factory = null;
		
		factory = new XiaomiFactory();
		factory.product();
		
		factory = new HuaweiFactory();
		factory.product();
	}
}
