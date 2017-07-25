package com.designpattern.bridge.solution_1;
/**
 * 使用邮件方式发送【普通】信息
 * @author Json
*/
public class CommonEmailMessage implements CommonMessage {
	
	@Override
	public void send(String message, String users) {
		message = "*普通*：" + message;
		System.out.println("使用邮件方式，发送信息【"+message+"】To【"+users+"】");
	}
}
