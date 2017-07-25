package com.designpattern.bridge.solution_1;
/**
 * 
 * @author Json
*/
public interface VeryUrgencyMessage extends Message {
	
	/** 
	 * 扩展自己的新功能：特急任务，需要催促接收人尽快完成
	 * @param messageId 消息的编号 
	 * @return
	 */  
	public void urge(String messageId); 
}
