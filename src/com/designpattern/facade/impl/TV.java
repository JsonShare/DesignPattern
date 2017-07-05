package com.designpattern.facade.impl;

import com.designpattern.facade.TVI;

/**
* 类说明 ：电视接口实现类
*/
public class TV implements TVI {
	@Override
	public void on() {
		System.out.println("打开电视");
	}
	@Override
	public void off() {
		System.out.println("关闭电视");
	}
}
