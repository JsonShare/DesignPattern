package com.designpattern.facade;

import com.designpattern.facade.impl.Light;
import com.designpattern.facade.impl.SmartHome;
import com.designpattern.facade.impl.TV;

/**
* 类说明 ：测试
*/
public class Test {
	public static void main(String[] args) {
		System.out.println("***************安装智能家居之前*********************");
		//----晚上下班回到家----
		//开灯光
		LightI light = new Light();
		light.on();
		//看电视
		TVI tv = new TV();
		tv.on();
		//-----睡觉-----
		//关灯光
		light.off();
		//关电视
		tv.off();
		
		System.out.println("***************安装智能家居之后*********************");
		
		SmartHomeI smarthome = new SmartHome();
		//----晚上下班回到家----
		smarthome.on();
		//-----睡觉-----
		smarthome.off();
	}
}
