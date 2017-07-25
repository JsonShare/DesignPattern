package com.designpattern.bridge.solution_2;
/**
 * 扩展抽象的消息  -- 加急消息
 * @author Json
*/
public class UrgencyMessage extends AbstractMessage{

	public UrgencyMessage(MessageImplementor impl) {
		super(impl);
	}

	public void sendMessage(String message, String toUser) {  
		message = "*加急*:" + message;
		super.sendMessage(message, toUser);  
	}   
}
