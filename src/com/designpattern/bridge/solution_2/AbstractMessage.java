package com.designpattern.bridge.solution_2;
/**
 * 抽象的消息对象
 * @author Json
*/
public abstract class AbstractMessage {
	/** 
	 * 持有一个实现部分的对象 
	 */  
	protected MessageImplementor impl;  
	  
	/** 
	 * 构造方法，传入实现部分的对象  
	 * @param impl 实现部分的对象 
	 */  
	public AbstractMessage(MessageImplementor impl){  
		this.impl = impl;  
	}  
	  
	/** 
	 * 发送消息，转调实现部分的方法 
	 * @param message 消息内容 
	 * @param toUser 接收人 
	 */  
	public void sendMessage(String message,String toUser){  
		this.impl.send(message, toUser);  
	}     
}
