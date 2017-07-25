package com.designpattern.bridge.solution_2;
/**
 * 使用短信方式发送信息
 * @author Json
*/
public class MobileMessage implements MessageImplementor {

	@Override
	public void send(String message, String users) {
		System.out.println("使用短信方式，发送信息【"+message+"】To【"+users+"】");
	}
}
