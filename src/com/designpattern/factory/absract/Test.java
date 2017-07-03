package com.designpattern.factory.absract;
/**
* 类说明 ：测试
*/
public class Test {

	public static void main(String[] args) {
		AbstractFactory factory = null;
		
		factory = new XiaomiFactory();
		factory.productMobile();
		factory.productMP3();
		
		factory = new HuaweiFactory();
		factory.productMobile();
		factory.productMP3();
	}
}
