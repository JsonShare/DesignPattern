package com.designpattern.bridge.solution_2;
/**
 * 扩展抽象的消息  -- 特急消息
 * @author Json
*/
public class VeryUrgencyMessage extends AbstractMessage{

	public VeryUrgencyMessage(MessageImplementor impl) {
		super(impl);
	}
	
	public void sendMessage(String message, String toUser) {  
		message = "*特急*:" + message;
		super.sendMessage(message, toUser);  
	}   
	
    /** 
	 * 扩展自己的新功能：特急任务，需要催促接收人尽快完成
	 * @param messageId 消息的编号 
	 * @return
	 */  
	public void urge(String messageId) {  
	    //发出催促的信息  ，比如：每隔半小时 发送一条催促消息
		//TODO 逻辑
	}  
}
