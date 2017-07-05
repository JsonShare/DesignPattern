package com.designpattern.facade.impl;

import com.designpattern.facade.LightI;
import com.designpattern.facade.SmartHomeI;
import com.designpattern.facade.TVI;

/**
* 类说明 ：智能家居总开关接口
*/
public class SmartHome implements SmartHomeI {
	
	private LightI light = new Light();
	private TVI tv = new TV();
	
	@Override
	public void on() {
		light.on();
		tv.on();
	}
	@Override
	public void off() {
		light.off();
		tv.off();
	}
}
