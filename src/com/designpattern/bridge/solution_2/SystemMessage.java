package com.designpattern.bridge.solution_2;
/**
 * 使用站內消息方式发送信息
 * @author Json
*/
public class SystemMessage implements MessageImplementor {

	@Override
	public void send(String message, String users) {
		System.out.println("使用站內消息方式，发送信息【"+message+"】To【"+users+"】");
	}
}
