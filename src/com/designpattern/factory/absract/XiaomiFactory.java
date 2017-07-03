package com.designpattern.factory.absract;
/**
* 类说明 ：小米工厂类
*/
public class XiaomiFactory implements AbstractFactory{

	@Override
	public Mobile productMobile() {
		System.out.println("生产小米手机.");
		return new XiaomiMobile();
	}

	@Override
	public MP3 productMP3() {
		System.out.println("生产小米MP3.");
		return new XiaomiMP3();
	}

}
