package com.designpattern.bridge.solution_2;
/**
 * 扩展抽象的消息  -- 普通消息
 * @author Json
*/
public class CommonMessage extends AbstractMessage{

	public CommonMessage(MessageImplementor impl) {
		super(impl);
	}

	public void sendMessage(String message, String toUser) {  
		message = "*普通*:" + message;
		super.sendMessage(message, toUser);  
	}   
}
