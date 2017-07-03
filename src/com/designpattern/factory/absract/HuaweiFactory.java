package com.designpattern.factory.absract;
/**
* 类说明 ：华为工厂类
*/
public class HuaweiFactory implements AbstractFactory{

	@Override
	public Mobile productMobile() {
		System.out.println("生产华为手机.");
		return new HuaweiMobile();
	}

	@Override
	public MP3 productMP3() {
		System.out.println("生产华为MP3.");
		return new HuaweiMP3();
	}

}
