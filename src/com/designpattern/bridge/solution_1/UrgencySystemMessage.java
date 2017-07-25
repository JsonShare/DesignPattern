package com.designpattern.bridge.solution_1;
/**
 * 使用站内消息方式发送【加急】信息
 * @author Json
*/
public class UrgencySystemMessage implements Message {

	@Override
	public void send(String message, String users) {
		message = "*加急*：" + message;
		System.out.println("使用站内消息方式，发送信息【"+message+"】To【"+users+"】");
	}
}
