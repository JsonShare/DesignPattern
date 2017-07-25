package com.designpattern.bridge.solution_2;
/**
 * 使用邮件方式发送信息
 * @author Json
*/
public class EmailMessage implements MessageImplementor {

	@Override
	public void send(String message, String users) {
		System.out.println("使用邮件方式，发送信息【"+message+"】To【"+users+"】");
	}
}
