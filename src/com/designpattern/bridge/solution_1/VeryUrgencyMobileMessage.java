package com.designpattern.bridge.solution_1;
/**
 * 使用短信方式发送【特急】信息
 * @author Json
*/
public class VeryUrgencyMobileMessage implements VeryUrgencyMessage {

	@Override
	public void send(String message, String users) {
		message = "*特急*：" + message;
		System.out.println("使用短信方式，发送信息【"+message+"】To【"+users+"】");
	}
	
	/** 
	 * 扩展自己的新功能：特急任务，需要催促接收人尽快完成
	 * @param messageId 消息的编号 
	 * @return
	 */ 
	@Override
	public void urge(String messageId) {  
	    //发出催促的信息  ，比如：每隔半小时 发送一条催促消息
		//TODO 逻辑
	}  
}
