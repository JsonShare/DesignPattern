package com.designpattern.bridge.solution_1;
/**
 * 使用短信方式发送【加急】信息
 * @author Json
*/
public class UrgencyMobileMessage implements Message {

	@Override
	public void send(String message, String users) {
		message = "*加急*：" + message;
		System.out.println("使用短信方式，发送信息【"+message+"】To【"+users+"】");
	}
}
