package com.designpattern.facade.impl;

import com.designpattern.facade.LightI;

/**
* 类说明 ：灯光接口实现类
*/
public class Light implements LightI {
	@Override
	public void on() {
		System.out.println("打开灯");
	}

	@Override
	public void off() {
		System.out.println("关闭灯");
	}
}
